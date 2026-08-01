package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13305e extends C11133e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f26534e;

    public C13305e(byte[] bArr) {
        super(bArr);
        C11133e.startapp(bArr.length);
        this.f26534e = 47;
    }

    @Override // defpackage.C11133e
    public final byte appmetrica(int i) {
        int i2 = this.f26534e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f22050e[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(AbstractC8647e.isPro(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // defpackage.C11133e
    public final byte billing(int i) {
        return this.f22050e[i];
    }

    @Override // defpackage.C11133e
    public final int yandex() {
        return this.f26534e;
    }
}
