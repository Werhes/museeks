package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6300e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Context f13123e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f13124e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public FileInputStream f13125e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f13126e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AssetFileDescriptor f13127e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C2435e f13128e;

    public C6300e(Context context) {
        super(false);
        this.f13123e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f13128e = null;
        try {
            try {
                FileInputStream fileInputStream = this.f13125e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f13125e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f13127e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C18297e(null, e, 2000);
                    }
                } finally {
                    this.f13127e = null;
                    if (this.f13124e) {
                        this.f13124e = false;
                        Signature();
                    }
                }
            } catch (IOException e2) {
                throw new C18297e(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.f13125e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f13127e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f13127e = null;
                    if (this.f13124e) {
                        this.f13124e = false;
                        Signature();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C18297e(null, e3, 2000);
                }
            } finally {
                this.f13127e = null;
                if (this.f13124e) {
                    this.f13124e = false;
                    Signature();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        C2435e c2435e = this.f13128e;
        if (c2435e != null) {
            return c2435e.ad;
        }
        return null;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        Resources resourcesForApplication;
        int parseInt;
        int i;
        Resources resources;
        this.f13128e = c2435e;
        admob();
        Uri uri = c2435e.ad;
        long j = c2435e.billing;
        long j2 = c2435e.purchase;
        Uri normalizeScheme = uri.normalizeScheme();
        boolean equals = TextUtils.equals("rawresource", normalizeScheme.getScheme());
        Context context = this.f13123e;
        if (equals) {
            resources = context.getResources();
            List<String> pathSegments = normalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C18297e("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C18297e("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                throw new C18297e("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = normalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(normalizeScheme.getHost()) ? context.getPackageName() : normalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C18297e("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    parseInt = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C18297e("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                parseInt = resourcesForApplication.getIdentifier(AbstractC4653e.isPro(packageName, ":", path), "raw", null);
                if (parseInt == 0) {
                    throw new C18297e("Resource not found.", null, 2005);
                }
            }
            i = parseInt;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(i);
            if (openRawResourceFd == null) {
                throw new C18297e("Resource is compressed: " + normalizeScheme, null, 2000);
            }
            this.f13127e = openRawResourceFd;
            long length = openRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f13127e.getFileDescriptor());
            this.f13125e = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new C18297e(null, null, 2008);
                }
                long startOffset = this.f13127e.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new C18297e(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f13126e = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f13126e = size;
                        if (size < 0) {
                            throw new C18297e(null, null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.f13126e = j3;
                    if (j3 < 0) {
                        throw new C18297e(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f13126e;
                    this.f13126e = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f13124e = true;
                subscription(c2435e);
                return j != -1 ? j : this.f13126e;
            } catch (C7997e e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C18297e(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C18297e(null, e4, 2005);
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13126e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C18297e(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f13125e;
            String str = AbstractC9413e.ad;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.f13126e;
                if (j2 != -1) {
                    this.f13126e = j2 - read;
                }
                mopub(read);
                return read;
            }
            if (this.f13126e != -1) {
                throw new C18297e("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
