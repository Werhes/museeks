package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* renamed from: eٟؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2047e extends AbstractC15047e implements InterfaceC3928e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final byte[] f5326e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0368e f5327e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public volatile C9648e f5328e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final byte[] f5329e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final byte[] f5330e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final byte[] f5331e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2047e(defpackage.C13798e r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2047e.<init>(eٓؗۦ):void");
    }

    public final byte[] ad() {
        byte[] adcel;
        synchronized (this) {
            try {
                int i = this.f5327e.purchase;
                int i2 = i + 4;
                int i3 = i2 + i;
                int i4 = i3 + i;
                byte[] bArr = new byte[i + i4];
                AbstractC3628e.billing(this.f5328e.f19127e, 0, bArr);
                AbstractC16947e.purchase(bArr, 4, this.f5329e);
                AbstractC16947e.purchase(bArr, i2, this.f5326e);
                AbstractC16947e.purchase(bArr, i3, this.f5331e);
                AbstractC16947e.purchase(bArr, i4, this.f5330e);
                try {
                    C9648e c9648e = this.f5328e;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    objectOutputStream.writeObject(c9648e);
                    objectOutputStream.flush();
                    adcel = AbstractC12442e.adcel(bArr, byteArrayOutputStream.toByteArray());
                } catch (IOException e) {
                    throw new RuntimeException("error serializing bds state: " + e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return adcel;
    }

    @Override // defpackage.InterfaceC3928e
    public final byte[] getEncoded() {
        byte[] ad;
        synchronized (this) {
            ad = ad();
        }
        return ad;
    }
}
