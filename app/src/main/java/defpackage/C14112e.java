package defpackage;

import android.net.TrafficStats;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14112e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f27913e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f27914e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f27915e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public HttpURLConnection f27916e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f27917e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public long f27918e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C16911e f27919e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public InputStream f27920e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C2435e f27921e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C16911e f27922e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final int f27923e;

    public C14112e(int i, int i2, C16911e c16911e) {
        super(true);
        this.f27913e = i;
        this.f27923e = i2;
        this.f27922e = c16911e;
        this.f27919e = new C16911e(27);
    }

    @Override // defpackage.AbstractC15896e, defpackage.InterfaceC9660e
    public final Map advert() {
        HttpURLConnection httpURLConnection = this.f27916e;
        return httpURLConnection == null ? C0409e.f2448e : new C12615e(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC9660e
    public final void close() {
        try {
            InputStream inputStream = this.f27920e;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    String str = AbstractC9413e.ad;
                    throw new C12700e(2000, 3, e);
                }
            }
        } finally {
            this.f27920e = null;
            remoteconfig();
            if (this.f27915e) {
                this.f27915e = false;
                Signature();
            }
            this.f27916e = null;
            this.f27921e = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        HttpURLConnection httpURLConnection = this.f27916e;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C2435e c2435e = this.f27921e;
        if (c2435e != null) {
            return c2435e.ad;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0153 A[Catch: IOException -> 0x015e, TRY_LEAVE, TryCatch #5 {IOException -> 0x015e, blocks: (B:25:0x014b, B:27:0x0153), top: B:24:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0142  */
    @Override // defpackage.InterfaceC9660e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long metrica(defpackage.C2435e r27) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14112e.metrica(eؚؔۜ):long");
    }

    public final HttpURLConnection pro(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f27913e);
        httpURLConnection.setReadTimeout(this.f27923e);
        HashMap hashMap = new HashMap();
        C16911e c16911e = this.f27922e;
        if (c16911e != null) {
            hashMap.putAll(c16911e.ads());
        }
        hashMap.putAll(this.f27919e.ads());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String ad = AbstractC4651e.ad(j, j2);
        if (ad != null) {
            httpURLConnection.setRequestProperty("Range", ad);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C2435e.vip(i));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f27917e;
            if (j != -1) {
                long j2 = j - this.f27918e;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f27920e;
            String str = AbstractC9413e.ad;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.f27918e += read;
                mopub(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            String str2 = AbstractC9413e.ad;
            throw C12700e.ad(2, e);
        }
    }

    public final void remoteconfig() {
        HttpURLConnection httpURLConnection = this.f27916e;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC2803e.billing("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    public final void signatures(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int min = (int) Math.min(j, 4096);
            InputStream inputStream = this.f27920e;
            String str = AbstractC9413e.ad;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new C12700e(2000, 1, new InterruptedIOException());
            }
            if (read == -1) {
                throw new C12700e(2008);
            }
            j -= read;
            mopub(read);
        }
    }
}
