package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؚٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7074e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AssetManager f14523e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public long f14524e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f14525e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InputStream f14526e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Uri f14527e;

    public C7074e(Context context) {
        super(false);
        this.f14523e = context.getAssets();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f14527e = null;
        try {
            try {
                InputStream inputStream = this.f14526e;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new C18297e(e, 2000);
            }
        } finally {
            this.f14526e = null;
            if (this.f14525e) {
                this.f14525e = false;
                Signature();
            }
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f14527e;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        try {
            Uri uri = c2435e.ad;
            long j = c2435e.purchase;
            this.f14527e = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            admob();
            InputStream open = this.f14523e.open(path, 1);
            this.f14526e = open;
            if (open.skip(j) < j) {
                throw new C18297e((Exception) null, 2008);
            }
            long j2 = c2435e.billing;
            if (j2 != -1) {
                this.f14524e = j2;
            } else {
                long available = this.f14526e.available();
                this.f14524e = available;
                if (available == 2147483647L) {
                    this.f14524e = -1L;
                }
            }
            this.f14525e = true;
            subscription(c2435e);
            return this.f14524e;
        } catch (C14854e e) {
            throw e;
        } catch (IOException e2) {
            throw new C18297e(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14524e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C18297e(e, 2000);
                }
            }
            InputStream inputStream = this.f14526e;
            String str = AbstractC9413e.ad;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.f14524e;
                if (j2 != -1) {
                    this.f14524e = j2 - read;
                }
                mopub(read);
                return read;
            }
        }
        return -1;
    }
}
