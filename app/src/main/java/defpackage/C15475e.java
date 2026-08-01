package defpackage;

import android.os.SystemClock;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15475e {
    public int ad;
    public Object metrica;
    public long vip;

    public C15475e(int i, long j, byte[] bArr) {
        this.vip = j;
        this.ad = i;
        this.metrica = bArr;
    }

    public C15475e(int i, URL url, long j) {
        this.ad = i;
        this.metrica = url;
        this.vip = j;
    }

    public C15475e(long j, Exception exc) {
        this.vip = SystemClock.elapsedRealtime() - j;
        if (exc instanceof C7858e) {
            this.ad = 2;
            this.metrica = exc;
            return;
        }
        if (!(exc instanceof C4573e)) {
            this.ad = 0;
            this.metrica = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.metrica = exc;
        if (exc instanceof C12624e) {
            this.ad = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.ad = 1;
        } else {
            this.ad = 0;
        }
    }

    public int ad() {
        Iterator it = ((List) this.metrica).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C10912e) it.next()).vip.intValue();
        }
        return i;
    }
}
