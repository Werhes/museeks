package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class StringDateTime extends StringSizeTerminated {
    public StringDateTime(StringDateTime stringDateTime) {
        super(stringDateTime);
    }

    public StringDateTime(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e);
    }

    @Override // ealvatag.tag.datatype.StringSizeTerminated, ealvatag.tag.datatype.TextEncodedStringSizeTerminated, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringDateTime) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public Object getValue() {
        Object obj = this.value;
        if (obj != null) {
            return obj.toString().replace(' ', 'T');
        }
        return null;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj != null) {
            this.value = obj.toString().replace(' ', 'T');
        }
    }
}
