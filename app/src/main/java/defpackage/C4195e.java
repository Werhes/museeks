package defpackage;

import java.math.BigInteger;

/* renamed from: eٌؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4195e implements InterfaceC2868e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ byte f9236e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C9345e f9237e;

    public C4195e(C9345e c9345e, byte b) {
        this.f9237e = c9345e;
        this.f9236e = b;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, eٕؓۦ, eؙٓۧ] */
    @Override // defpackage.InterfaceC2868e
    public final InterfaceC6396e appmetrica(InterfaceC6396e interfaceC6396e) {
        if (interfaceC6396e instanceof C1838e) {
            return interfaceC6396e;
        }
        ?? obj = new Object();
        obj.ad = null;
        BigInteger bigInteger = AbstractC1661e.ad;
        C9345e c9345e = this.f9237e;
        AbstractC9932e loadAd = c9345e.loadAd();
        AbstractC0362e abstractC0362e = c9345e.ad;
        C9345e c9345e2 = (C9345e) loadAd;
        byte[][] bArr = this.f9236e == 0 ? AbstractC1661e.license : AbstractC1661e.purchase;
        int length = (bArr.length + 1) >>> 1;
        C9345e[] c9345eArr = new C9345e[length];
        c9345eArr[0] = c9345e;
        int length2 = bArr.length;
        for (int i = 3; i < length2; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            C9345e c9345e3 = (C9345e) abstractC0362e.smaato();
            int i3 = 0;
            for (int length3 = bArr2.length - 1; length3 >= 0; length3--) {
                i3++;
                byte b = bArr2[length3];
                if (b != 0) {
                    c9345e3 = (C9345e) c9345e3.m2543class(i3).ad(b > 0 ? c9345e : c9345e2);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                c9345e3 = c9345e3.m2543class(i3);
            }
            c9345eArr[i2] = c9345e3;
        }
        abstractC0362e.getClass();
        abstractC0362e.Signature(c9345eArr, 0, length, null);
        obj.ad = c9345eArr;
        return obj;
    }
}
