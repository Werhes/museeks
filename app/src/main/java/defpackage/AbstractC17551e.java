package defpackage;

/* renamed from: e٘ؖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17551e extends AbstractC16431e implements InterfaceC14556e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC2227e f34404e;

    public AbstractC17551e(InterfaceC2227e interfaceC2227e) {
        this.f34404e = interfaceC2227e;
    }

    public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4 = i + i2;
        if (i4 > bArr.length) {
            throw new RuntimeException("input buffer too small");
        }
        if (i3 + i2 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        while (i < i4) {
            bArr2[i3] = vip(bArr[i]);
            i3++;
            i++;
        }
        return i2;
    }

    public abstract byte vip(byte b);
}
