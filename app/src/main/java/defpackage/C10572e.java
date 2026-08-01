package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10572e extends C4334e {
    public C10572e(int i) {
        super(EnumC14687e.TRACK.f29091e, String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.f9469e = arrayList;
        arrayList.add(new Short("0"));
        this.f9469e.add(Short.valueOf((short) i));
        this.f9469e.add(new Short("0"));
        this.f9469e.add(new Short("0"));
    }

    public C10572e(int i, int i2) {
        super(EnumC14687e.TRACK.f29091e, String.valueOf(i));
        ArrayList arrayList = new ArrayList();
        this.f9469e = arrayList;
        arrayList.add(new Short("0"));
        this.f9469e.add(Short.valueOf((short) i));
        this.f9469e.add(Short.valueOf((short) i2));
        this.f9469e.add(new Short("0"));
    }

    @Override // defpackage.C4334e, defpackage.C9405e, defpackage.AbstractC8492e
    public final void ad(ByteBuffer byteBuffer) {
        this.f9469e = new C9890e(new C18529e(byteBuffer), byteBuffer).f19503e;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f9469e;
        if (arrayList != null) {
            if (arrayList.size() > 1 && ((Short) this.f9469e.get(1)).shortValue() > 0) {
                sb.append(this.f9469e.get(1));
            }
            if (this.f9469e.size() > 2 && ((Short) this.f9469e.get(2)).shortValue() > 0) {
                sb.append("/");
                sb.append(this.f9469e.get(2));
            }
        }
        this.f18719e = sb.toString();
    }

    public final Short appmetrica() {
        if (this.f9469e.size() <= 2) {
            return (short) 0;
        }
        return (Short) this.f9469e.get(2);
    }
}
