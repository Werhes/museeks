package defpackage;

import android.graphics.Canvas;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٟؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2002e extends AbstractC10727e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC4082e f5208e;

    public C2002e(InterfaceC4082e interfaceC4082e) {
        this.f5208e = interfaceC4082e;
    }

    @Override // defpackage.AbstractC10727e
    public final void adcel(InterfaceC2235e interfaceC2235e) {
        InterfaceC4082e interfaceC4082e = this.f5208e;
        int width = interfaceC4082e.getWidth();
        float intBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (interfaceC2235e.yandex() >> 32)) / width : 1.0f;
        int vip = interfaceC4082e.vip();
        float intBitsToFloat2 = vip > 0 ? Float.intBitsToFloat((int) (interfaceC2235e.yandex() & 4294967295L)) / vip : 1.0f;
        C18478e mo782finally = interfaceC2235e.mo782finally();
        long m4560try = mo782finally.m4560try();
        mo782finally.m4557this().billing();
        try {
            ((C5389e) mo782finally.f36228e).firebase(intBitsToFloat, intBitsToFloat2, 0L);
            InterfaceC14576e m4557this = interfaceC2235e.mo782finally().m4557this();
            Canvas canvas = AbstractC16863e.ad;
            interfaceC4082e.billing(((C11648e) m4557this).ad);
        } finally {
            AbstractC0054e.m224this(mo782finally, m4560try);
        }
    }

    @Override // defpackage.AbstractC10727e
    public final long startapp() {
        InterfaceC4082e interfaceC4082e = this.f5208e;
        int width = interfaceC4082e.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(interfaceC4082e.vip() > 0 ? r0 : Float.NaN) & 4294967295L);
    }
}
