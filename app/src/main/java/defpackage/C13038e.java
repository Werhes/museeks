package defpackage;

import java.security.SecureRandom;

/* renamed from: eْؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C13038e {
    public SecureRandom ad;
    public int vip;

    public byte[] ad() {
        byte[] bArr = new byte[this.vip];
        this.ad.nextBytes(bArr);
        return bArr;
    }

    public void vip(C13572e c13572e) {
        this.ad = (SecureRandom) c13572e.f26878e;
        this.vip = (c13572e.f26879e + 7) / 8;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }
}
