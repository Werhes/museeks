package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2950e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public RandomAccessFile f6968e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public boolean f6969e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f6970e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Uri f6971e;

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f6971e = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f6968e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C18297e(e, 2000);
            }
        } finally {
            this.f6968e = null;
            if (this.f6969e) {
                this.f6969e = false;
                Signature();
            }
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f6971e;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        Uri uri = c2435e.ad;
        long j = c2435e.purchase;
        this.f6971e = uri;
        admob();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f6968e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long j2 = c2435e.billing;
                if (j2 == -1) {
                    j2 = this.f6968e.length() - j;
                }
                this.f6970e = j2;
                if (j2 < 0) {
                    throw new C18297e(null, null, 2008);
                }
                this.f6969e = true;
                subscription(c2435e);
                return this.f6970e;
            } catch (IOException e) {
                throw new C18297e(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C18297e(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder tapsense = AbstractC17861e.tapsense("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            tapsense.append(fragment);
            throw new C18297e(tapsense.toString(), e2, 1004);
        } catch (SecurityException e3) {
            throw new C18297e(e3, 2006);
        } catch (RuntimeException e4) {
            throw new C18297e(e4, 2000);
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f6970e;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f6968e;
            String str = AbstractC9413e.ad;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f6970e -= read;
                mopub(read);
            }
            return read;
        } catch (IOException e) {
            throw new C18297e(e, 2000);
        }
    }
}
