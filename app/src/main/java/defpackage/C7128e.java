package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7128e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C2435e f14602e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f14603e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f14604e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public byte[] f14605e;

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        if (this.f14605e != null) {
            this.f14605e = null;
            Signature();
        }
        this.f14602e = null;
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        C2435e c2435e = this.f14602e;
        if (c2435e != null) {
            return c2435e.ad;
        }
        return null;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        admob();
        this.f14602e = c2435e;
        Uri uri = c2435e.ad;
        long j = c2435e.billing;
        Uri normalizeScheme = uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        AbstractC2301e.startapp("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        String str = AbstractC9413e.ad;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length != 2) {
            throw new C15125e("Unexpected URI format: " + normalizeScheme, null, true, 0);
        }
        String str2 = split[1];
        if (split[0].contains(";base64")) {
            try {
                this.f14605e = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e) {
                throw new C15125e(AbstractC17861e.Signature("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            this.f14605e = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j2 = c2435e.purchase;
        byte[] bArr = this.f14605e;
        if (j2 > bArr.length) {
            this.f14605e = null;
            throw new C18297e(2008);
        }
        int i = (int) j2;
        this.f14604e = i;
        int length = bArr.length - i;
        this.f14603e = length;
        if (j != -1) {
            this.f14603e = (int) Math.min(length, j);
        }
        subscription(c2435e);
        return j != -1 ? j : this.f14603e;
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f14603e;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f14605e;
        String str = AbstractC9413e.ad;
        System.arraycopy(bArr2, this.f14604e, bArr, i, min);
        this.f14604e += min;
        this.f14603e -= min;
        mopub(min);
        return min;
    }
}
