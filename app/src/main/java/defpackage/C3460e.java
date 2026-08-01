package defpackage;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٙ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3460e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C7936e f7712e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C0829e f7713e;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f7712e = new C7936e(2);
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eٓٔؔ */
    public final boolean mo741e() {
        AbstractC11095e c15909e;
        C18524e c18524e = (C18524e) this.f22047e;
        ByteBuffer byteBuffer = (ByteBuffer) this.f22046e;
        int i = 0;
        while (true) {
            C7936e c7936e = f7712e;
            if (i >= 3) {
                byte b = byteBuffer.get();
                if (b == 2) {
                    c15909e = new C15909e();
                    EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i2 = C1724e.ad;
                } else if (b == 3) {
                    c15909e = new C10768e();
                    EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i3 = C1724e.ad;
                } else {
                    if (b != 4) {
                        return false;
                    }
                    c15909e = new C13292e();
                    EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
                    c7936e.getClass();
                    int i4 = C1724e.ad;
                }
                c15909e.f21996e = Long.valueOf(c18524e.f36319e + 8);
                c15909e.f21997e = Long.valueOf(c18524e.f36319e + 8 + c18524e.f36318e);
                C0829e c0829e = this.f7713e;
                c0829e.f3215e = true;
                c0829e.f3220e = c15909e;
                byteBuffer.position(0);
                try {
                    c15909e.read(byteBuffer);
                    return true;
                } catch (AbstractC7384e e) {
                    EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
                    e.getMessage();
                    c7936e.getClass();
                    int i5 = C1724e.ad;
                    return false;
                }
            }
            if (byteBuffer.get() != AbstractC11095e.f21993e[i]) {
                EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
                c7936e.getClass();
                int i6 = C1724e.ad;
                return false;
            }
            i++;
        }
    }
}
