package defpackage;

/* renamed from: eٔؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C14458e extends isPro {
    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        byte[] bArr = this.f36413e;
        int i = bArr[0] & 255;
        int length = bArr.length;
        int i2 = length - 1;
        byte b = bArr[i2];
        byte b2 = (byte) ((255 << i) & b);
        if (b == b2) {
            c7850e.m2337implements(3, z, bArr);
            return;
        }
        c7850e.m2343super(3, z);
        c7850e.m2330abstract(length);
        c7850e.m2331break(bArr, 0, i2);
        c7850e.m2341protected(b2);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.isPro, defpackage.Cdefault
    public final Cdefault ads() {
        return this;
    }

    @Override // defpackage.isPro, defpackage.Cdefault
    public final Cdefault premium() {
        return this;
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        return C7850e.m2327goto(this.f36413e.length, z);
    }
}
