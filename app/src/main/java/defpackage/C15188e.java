package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15188e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final InterfaceC1726e f30048e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public long f30049e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public boolean f30050e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C11058e f30051e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public long f30052e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final InterfaceC11801e f30053e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public InputStream f30054e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C2435e f30055e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C16911e f30056e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C16911e f30057e;

    static {
        AbstractC1418e.ad("media3.datasource.okhttp");
    }

    public C15188e(InterfaceC1726e interfaceC1726e, C16911e c16911e, C15660e c15660e) {
        super(true);
        interfaceC1726e.getClass();
        this.f30048e = interfaceC1726e;
        this.f30056e = c16911e;
        this.f30053e = c15660e;
        this.f30057e = new C16911e(27);
    }

    @Override // defpackage.AbstractC15896e, defpackage.InterfaceC9660e
    public final Map advert() {
        C11058e c11058e = this.f30051e;
        return c11058e == null ? Collections.EMPTY_MAP : c11058e.f21946e.startapp();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        if (this.f30050e) {
            this.f30050e = false;
            Signature();
            remoteconfig();
        }
        this.f30051e = null;
        this.f30055e = null;
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        C11058e c11058e = this.f30051e;
        if (c11058e != null) {
            return Uri.parse(c11058e.f21944e.ad.startapp);
        }
        C2435e c2435e = this.f30055e;
        if (c2435e != null) {
            return c2435e.ad;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v18, types: [eؚؑ۟, java.lang.Object] */
    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        C15718e c15718e;
        C12999e c12999e;
        this.f30055e = c2435e;
        this.f30052e = 0L;
        this.f30049e = 0L;
        admob();
        long j = c2435e.purchase;
        int i = c2435e.metrica;
        long j2 = c2435e.billing;
        String uri = c2435e.ad.toString();
        try {
            C14052e c14052e = new C14052e();
            c14052e.adcel(null, uri);
            c15718e = c14052e.metrica();
        } catch (IllegalArgumentException unused) {
            c15718e = null;
        }
        if (c15718e == null) {
            throw new C12700e("Malformed URL", 1004);
        }
        C18464e c18464e = new C18464e(23);
        c18464e.f36191e = c15718e;
        HashMap hashMap = new HashMap();
        C16911e c16911e = this.f30056e;
        if (c16911e != null) {
            hashMap.putAll(c16911e.ads());
        }
        hashMap.putAll(this.f30057e.ads());
        hashMap.putAll(c2435e.appmetrica);
        for (Map.Entry entry : hashMap.entrySet()) {
            ((C15783e) c18464e.f36192e).adcel((String) entry.getKey(), (String) entry.getValue());
        }
        String ad = AbstractC4651e.ad(j, j2);
        if (ad != null) {
            ((C15783e) c18464e.f36192e).purchase("Range", ad);
        }
        if ((c2435e.startapp & 1) != 1) {
            ((C15783e) c18464e.f36192e).purchase("Accept-Encoding", "identity");
        }
        byte[] bArr = c2435e.license;
        if (bArr != null) {
            c12999e = C6173e.subscription(bArr.length, null, bArr);
        } else if (i == 2) {
            byte[] bArr2 = AbstractC9413e.vip;
            c12999e = C6173e.subscription(bArr2.length, null, bArr2);
        } else {
            c12999e = null;
        }
        c18464e.m4494e(C2435e.vip(i), c12999e);
        C4602e vip = ((C1343e) this.f30048e).vip(new C8650e(c18464e));
        try {
            ?? obj = new Object();
            vip.appmetrica(new C5389e(19, (Object) obj));
            try {
                C11058e c11058e = (C11058e) obj.get();
                this.f30051e = c11058e;
                AbstractC12834e abstractC12834e = c11058e.f21945e;
                abstractC12834e.getClass();
                this.f30054e = abstractC12834e.mo1012e().mo1680e();
                int i2 = c11058e.f21942e;
                if (!c11058e.f21939e) {
                    if (i2 == 416 && j == AbstractC4651e.vip(c11058e.f21946e.appmetrica("Content-Range"))) {
                        this.f30050e = true;
                        subscription(c2435e);
                        if (j2 != -1) {
                            return j2;
                        }
                        return 0L;
                    }
                    try {
                        InputStream inputStream = this.f30054e;
                        inputStream.getClass();
                        AbstractC15517e.vip(inputStream);
                    } catch (IOException unused2) {
                        String str = AbstractC9413e.ad;
                    }
                    TreeMap startapp = c11058e.f21946e.startapp();
                    remoteconfig();
                    throw new C16254e(i2, i2 == 416 ? new C18297e(2008) : null, startapp);
                }
                C14133e purchase = abstractC12834e.purchase();
                String str2 = purchase != null ? purchase.ad : BuildConfig.FLAVOR;
                InterfaceC11801e interfaceC11801e = this.f30053e;
                if (interfaceC11801e != null && !interfaceC11801e.apply(str2)) {
                    remoteconfig();
                    throw new C12700e(AbstractC17861e.Signature("Invalid content type: ", str2), 2003);
                }
                long j3 = (i2 != 200 || j == 0) ? 0L : j;
                if (j2 != -1) {
                    this.f30049e = j2;
                } else {
                    long license = abstractC12834e.license();
                    this.f30049e = license != -1 ? license - j3 : -1L;
                }
                this.f30050e = true;
                subscription(c2435e);
                try {
                    pro(j3);
                    return this.f30049e;
                } catch (C12700e e) {
                    remoteconfig();
                    throw e;
                }
            } catch (InterruptedException unused3) {
                vip.license();
                throw new InterruptedIOException();
            } catch (ExecutionException e2) {
                throw new IOException(e2);
            }
        } catch (IOException e3) {
            throw C12700e.ad(1, e3);
        }
    }

    public final void pro(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            try {
                int min = (int) Math.min(j, 4096);
                InputStream inputStream = this.f30054e;
                String str = AbstractC9413e.ad;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new C12700e(2008);
                }
                j -= read;
                mopub(read);
            } catch (IOException e) {
                if (!(e instanceof C12700e)) {
                    throw new C12700e(2000);
                }
                throw ((C12700e) e);
            }
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f30049e;
            if (j != -1) {
                long j2 = j - this.f30052e;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f30054e;
            String str = AbstractC9413e.ad;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.f30052e += read;
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
        C11058e c11058e = this.f30051e;
        if (c11058e != null) {
            AbstractC12834e abstractC12834e = c11058e.f21945e;
            abstractC12834e.getClass();
            abstractC12834e.close();
        }
        this.f30054e = null;
    }
}
