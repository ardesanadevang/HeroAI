const anExampleVariable = {
    "a": 123,
    "b": 'hero',
    "c": [1, 2, 3],
    "d": {
        "e": 3,
        "f": ['abc', 'def']
    }
}

const applyModification = (obj: any) => {
    Object.entries(obj).forEach(([key, value], index) => {
        obj[key] = modifyValue(value)
    }, obj);
    return obj
}

const modifyValue = (value: any) => {
    if(typeof value === 'number'){
        return value+1
    } else if(typeof value === 'string'){
        return `${value} AI`
    } else {
        return applyModification(value)
    }
}

const result = applyModification(anExampleVariable)
console.log("result",result)

