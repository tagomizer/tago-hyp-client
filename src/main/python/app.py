from starlette.applications import Starlette
from starlette.responses import JSONResponse
from starlette.routing import Route
import nounspotter


async def process(request):
    ''' 
    request = a JSON Object := {'text':<some sentence>}
    '''
    json = await request.json()

    print('Debug:', json)
    json = nounspotter.handleGet(json)
    print(json)
    return JSONResponse(json)

routes = [
    Route('/',process, methods=['POST'])
]
app = Starlette(debug=True, routes=routes)