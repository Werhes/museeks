package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10553e extends AbstractC11321e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f20832e;

    public C10553e(byte[] bArr) {
        bArr.getClass();
        this.f20832e = bArr;
    }

    @Override // defpackage.AbstractC7244e
    public final void adcel(AbstractC13874e abstractC13874e) {
        byte[] bArr = this.f20832e;
        abstractC13874e.admob(0, bArr.length, bArr);
    }

    @Override // defpackage.AbstractC7244e
    public final boolean advert(AbstractC7244e abstractC7244e) {
        boolean z = abstractC7244e instanceof C10553e;
        byte[] bArr = this.f20832e;
        if (z) {
            return Arrays.equals(bArr, ((C10553e) abstractC7244e).f20832e);
        }
        boolean z2 = abstractC7244e instanceof C7009e;
        if (!z2) {
            return abstractC7244e.advert(this);
        }
        C7009e c7009e = (C7009e) abstractC7244e;
        int i = c7009e.f14345e;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length <= i) {
            if (z) {
                return AbstractC7244e.remoteconfig(bArr, 0, 0, ((C10553e) abstractC7244e).f20832e, length);
            }
            if (!z2) {
                return abstractC7244e.yandex(0, length).equals(yandex(0, length));
            }
            return AbstractC7244e.remoteconfig(bArr, 0, c7009e.f14347e, c7009e.f14346e, length);
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 27 + String.valueOf(i).length());
        sb2.append("Ran off end of other: 0, ");
        sb2.append(length);
        sb2.append(", ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.AbstractC7244e
    public final byte appmetrica(int i) {
        return this.f20832e[i];
    }

    @Override // defpackage.AbstractC7244e
    public final int billing() {
        return this.f20832e.length;
    }

    @Override // defpackage.AbstractC7244e
    public final int smaato(int i, int i2) {
        return AbstractC17904e.ad(i, 0, i2, this.f20832e);
    }

    @Override // defpackage.AbstractC7244e
    public final void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f20832e, 0, bArr, 0, i);
    }

    @Override // defpackage.AbstractC7244e
    public final AbstractC11321e yandex(int i, int i2) {
        byte[] bArr = this.f20832e;
        int subscription = AbstractC7244e.subscription(0, i2, bArr.length);
        return subscription == 0 ? AbstractC7244e.f14800e : new C7009e(bArr, 0, subscription);
    }
}
