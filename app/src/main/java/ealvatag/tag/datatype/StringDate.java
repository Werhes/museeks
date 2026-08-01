package ealvatag.tag.datatype;

import defpackage.AbstractC12444e;
import defpackage.AbstractC2251e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class StringDate extends StringFixedLength {
    public StringDate(StringDate stringDate) {
        super(stringDate);
    }

    public StringDate(String str, AbstractC12444e abstractC12444e) {
        super(str, abstractC12444e, 8);
    }

    @Override // ealvatag.tag.datatype.StringFixedLength, ealvatag.tag.datatype.AbstractDataType
    public boolean equals(Object obj) {
        return (obj instanceof StringDate) && super.equals(obj);
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public Object getValue() {
        Object obj = this.value;
        if (obj != null) {
            return AbstractC2251e.amazon(obj.toString());
        }
        return null;
    }

    @Override // ealvatag.tag.datatype.AbstractDataType
    public void setValue(Object obj) {
        if (obj != null) {
            this.value = AbstractC2251e.amazon(obj.toString());
        }
    }
}
