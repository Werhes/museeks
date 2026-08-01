package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3416e implements InterfaceC11216e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f7640e = new Object();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C5891e f7641e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f7642e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f7643e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f7644e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f7645e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C6922e f7646e;

    public C3416e(Context context, String str, C5891e c5891e, boolean z) {
        this.f7644e = context;
        this.f7642e = str;
        this.f7641e = c5891e;
        this.f7643e = z;
    }

    public final C6922e ad() {
        C6922e c6922e;
        synchronized (this.f7640e) {
            try {
                if (this.f7646e == null) {
                    C4734e[] c4734eArr = new C4734e[1];
                    if (this.f7642e == null || !this.f7643e) {
                        this.f7646e = new C6922e(this.f7644e, this.f7642e, c4734eArr, this.f7641e);
                    } else {
                        this.f7646e = new C6922e(this.f7644e, new File(this.f7644e.getNoBackupFilesDir(), this.f7642e).getAbsolutePath(), c4734eArr, this.f7641e);
                    }
                    this.f7646e.setWriteAheadLoggingEnabled(this.f7645e);
                }
                c6922e = this.f7646e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c6922e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ad().close();
    }

    @Override // defpackage.InterfaceC11216e
    public final C4734e getWritableDatabase() {
        return ad().license();
    }

    @Override // defpackage.InterfaceC11216e
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f7640e) {
            try {
                C6922e c6922e = this.f7646e;
                if (c6922e != null) {
                    c6922e.setWriteAheadLoggingEnabled(z);
                }
                this.f7645e = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
