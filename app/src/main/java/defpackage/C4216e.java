package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4216e extends C4334e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C7936e f9288e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f9288e = new C7936e(2);
    }

    public C4216e(String str) {
        super(EnumC14687e.GENRE.f29091e, str);
        try {
            short parseShort = Short.parseShort(str);
            if (parseShort <= 125) {
                ArrayList arrayList = new ArrayList();
                this.f9469e = arrayList;
                arrayList.add(Short.valueOf((short) (parseShort + 1)));
            } else {
                ArrayList arrayList2 = new ArrayList();
                this.f9469e = arrayList2;
                arrayList2.add((short) 1);
            }
        } catch (NumberFormatException unused) {
            Integer m4566abstract = C18540e.m4564default().m4566abstract(str);
            if (m4566abstract == null || m4566abstract.intValue() > 125) {
                ArrayList arrayList3 = new ArrayList();
                this.f9469e = arrayList3;
                arrayList3.add((short) 1);
            } else {
                ArrayList arrayList4 = new ArrayList();
                this.f9469e = arrayList4;
                arrayList4.add(Short.valueOf((short) (m4566abstract.intValue() + 1)));
            }
        }
    }

    @Override // defpackage.C4334e, defpackage.C9405e, defpackage.AbstractC8492e
    public final void ad(ByteBuffer byteBuffer) {
        ArrayList arrayList = new C9890e(new C18529e(byteBuffer), byteBuffer).f19503e;
        this.f9469e = arrayList;
        if (arrayList.size() > 0) {
            this.f18719e = C18540e.m4564default().getValue(((Short) this.f9469e.get(0)).shortValue() - 1);
        } else {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            f9288e.getClass();
            int i = C1724e.ad;
        }
    }
}
