package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068e extends AbstractC15896e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final ContentResolver f1227e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public boolean f1228e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public FileInputStream f1229e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public long f1230e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AssetFileDescriptor f1231e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Uri f1232e;

    public C0068e(Context context) {
        super(false);
        this.f1227e = context.getContentResolver();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        this.f1232e = null;
        try {
            try {
                FileInputStream fileInputStream = this.f1229e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f1229e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f1231e;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C18297e(e, 2000);
                    }
                } finally {
                    this.f1231e = null;
                    if (this.f1228e) {
                        this.f1228e = false;
                        Signature();
                    }
                }
            } catch (IOException e2) {
                throw new C18297e(e2, 2000);
            }
        } catch (Throwable th) {
            this.f1229e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.f1231e;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.f1231e = null;
                    if (this.f1228e) {
                        this.f1228e = false;
                        Signature();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C18297e(e3, 2000);
                }
            } finally {
                this.f1231e = null;
                if (this.f1228e) {
                    this.f1228e = false;
                    Signature();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        return this.f1232e;
    }

    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        int i;
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            try {
                Uri uri = c2435e.ad;
                long j = c2435e.billing;
                long j2 = c2435e.purchase;
                Uri normalizeScheme = uri.normalizeScheme();
                this.f1232e = normalizeScheme;
                admob();
                boolean equals = Objects.equals(normalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.f1227e;
                if (equals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(normalizeScheme, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(normalizeScheme, "r");
                }
                this.f1231e = openAssetFileDescriptor;
                if (openAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new C18297e(new IOException("Could not open file descriptor for: " + normalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new C18297e(e, i);
                    }
                }
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f1229e = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new C18297e((Exception) null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (skip != j2) {
                    throw new C18297e((Exception) null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.f1230e = -1L;
                    } else {
                        long position = size - channel.position();
                        this.f1230e = position;
                        if (position < 0) {
                            throw new C18297e((Exception) null, 2008);
                        }
                    }
                } else {
                    long j3 = length - skip;
                    this.f1230e = j3;
                    if (j3 < 0) {
                        throw new C18297e((Exception) null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.f1230e;
                    this.f1230e = j4 == -1 ? j : Math.min(j4, j);
                }
                this.f1228e = true;
                subscription(c2435e);
                return j != -1 ? j : this.f1230e;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (C14588e e3) {
            throw e3;
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f1230e;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new C18297e(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.f1229e;
            String str = AbstractC9413e.ad;
            int read = fileInputStream.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.f1230e;
                if (j2 != -1) {
                    this.f1230e = j2 - read;
                }
                mopub(read);
                return read;
            }
        }
        return -1;
    }
}
