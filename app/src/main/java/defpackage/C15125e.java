package defpackage;

import java.io.IOException;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۧۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C15125e extends IOException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f29908e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f29909e;

    public C15125e(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f29909e = z;
        this.f29908e = i;
    }

    public static C15125e ad(RuntimeException runtimeException, String str) {
        return new C15125e(str, runtimeException, true, 1);
    }

    public static C15125e metrica(String str) {
        return new C15125e(str, null, false, 1);
    }

    public static C15125e vip(String str) {
        return new C15125e(str, null, true, 4);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        StringBuilder sb = new StringBuilder();
        sb.append(message != null ? message.concat(" ") : BuildConfig.FLAVOR);
        sb.append("{contentIsMalformed=");
        sb.append(this.f29909e);
        sb.append(", dataType=");
        return AbstractC17861e.smaato(this.f29908e, "}", sb);
    }
}
