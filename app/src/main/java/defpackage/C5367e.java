package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5367e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C7936e f11500e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C12671e f11501e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f11500e = new C7936e(2);
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eٓٔؔ */
    public final boolean mo741e() {
        AbstractC11095e c15909e;
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        C7936e c7936e = f11500e;
        c7936e.getClass();
        int i = C1724e.ad;
        ByteBuffer byteBuffer = (ByteBuffer) this.f22046e;
        for (int i2 = 0; i2 < 3; i2++) {
            if (byteBuffer.get() != AbstractC11095e.f21993e[i2]) {
                EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i3 = C1724e.ad;
                return false;
            }
        }
        byte b = byteBuffer.get();
        if (b == 2) {
            c15909e = new C15909e();
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
        } else if (b == 3) {
            c15909e = new C10768e();
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
        } else {
            if (b != 4) {
                return false;
            }
            c15909e = new C13292e();
            EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i6 = C1724e.ad;
        }
        this.f11501e.f25402e = c15909e;
        byteBuffer.position(0);
        try {
            c15909e.read(byteBuffer);
            return true;
        } catch (AbstractC7384e unused) {
            EnumC1005e[] enumC1005eArr6 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i7 = C1724e.ad;
            return false;
        }
    }
}
