package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2443e implements InterfaceC7004e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2443e f6249e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C2443e f6250e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f6251e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6252e;

    static {
        int i = 0;
        f6249e = new C2443e("TINK", i);
        f6250e = new C2443e("NO_PREFIX", i);
    }

    public /* synthetic */ C2443e() {
        this.f6252e = 1;
    }

    public /* synthetic */ C2443e(String str, int i) {
        this.f6252e = i;
        this.f6251e = str;
    }

    public static C2443e vip(C16151e c16151e, byte[] bArr) {
        Charset charset = AbstractC4639e.vip;
        C7936e c7936e = AbstractC1983e.ad;
        if (bArr.length < 9) {
            bArr = new byte[9];
        } else {
            if (9 > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(AbstractC17861e.smaato(bArr.length, " length:9", new StringBuilder("a:")));
            }
            for (int i = 0; i < 9; i++) {
                bArr[i] = 0;
            }
        }
        int length = bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = c16151e.Signature(i2);
        }
        String str = new String(bArr, 0, 9, charset);
        if (!str.startsWith("LAME")) {
            return null;
        }
        C2443e c2443e = new C2443e();
        c2443e.f6251e = str;
        return c2443e;
    }

    public C2443e ad(String str) {
        return new C2443e(this + "." + str, 3);
    }

    public String toString() {
        switch (this.f6252e) {
            case 0:
                return this.f6251e;
            case 1:
            default:
                return super.toString();
            case 2:
                return AbstractC4653e.applovin(new StringBuilder("<"), this.f6251e, '>');
            case 3:
                return this.f6251e;
        }
    }
}
