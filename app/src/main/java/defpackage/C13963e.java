package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13963e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C2303e f27678e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27679e;

    public /* synthetic */ C13963e(C2303e c2303e, int i) {
        this.f27679e = i;
        this.f27678e = c2303e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27679e) {
            case 0:
                C3295e c3295e = C3295e.f7451e;
                StringBuilder sb = new StringBuilder();
                C2303e c2303e = this.f27678e;
                sb.append((Object) C5060e.vip(c2303e.f5823e));
                sb.append("#availableCaptureRequestKeys");
                String sb2 = sb.toString();
                try {
                    try {
                        Trace.beginSection(sb2);
                        Set m3582e = Build.VERSION.SDK_INT >= 33 ? AbstractC13480e.m3582e(AbstractC14380e.billing(c2303e.f5820e, c2303e.f5821e)) : c3295e;
                        Trace.endSection();
                        return m3582e;
                    } finally {
                    }
                } catch (Throwable th) {
                    Log.w("CXCP", "Failed to get " + sb2 + "! Caching {} and ignoring exception.", th);
                    return c3295e;
                }
            case 1:
                C3295e c3295e2 = C3295e.f7451e;
                StringBuilder sb3 = new StringBuilder();
                C2303e c2303e2 = this.f27678e;
                sb3.append((Object) C5060e.vip(c2303e2.f5823e));
                sb3.append("#availableCaptureResultKeys");
                String sb4 = sb3.toString();
                try {
                    try {
                        Trace.beginSection(sb4);
                        Set m3582e2 = Build.VERSION.SDK_INT >= 33 ? AbstractC13480e.m3582e(AbstractC14380e.yandex(c2303e2.f5820e, c2303e2.f5821e)) : c3295e2;
                        Trace.endSection();
                        return m3582e2;
                    } finally {
                    }
                } catch (Throwable th2) {
                    Log.w("CXCP", "Failed to get " + sb4 + "! Caching {} and ignoring exception.", th2);
                    return c3295e2;
                }
            case 2:
                StringBuilder sb5 = new StringBuilder();
                C2303e c2303e3 = this.f27678e;
                sb5.append((Object) C5060e.vip(c2303e3.f5823e));
                sb5.append("#isPostviewSupported");
                String sb6 = sb5.toString();
                boolean z = false;
                try {
                    try {
                        Trace.beginSection(sb6);
                        boolean tapsense = Build.VERSION.SDK_INT >= 34 ? AbstractC5666e.tapsense(c2303e3.f5820e, c2303e3.f5821e) : false;
                        Trace.endSection();
                        z = tapsense;
                    } catch (Throwable th3) {
                        Log.w("CXCP", "Failed to get " + sb6 + "! Caching false and ignoring exception.", th3);
                    }
                    return Boolean.valueOf(z);
                } finally {
                }
            default:
                StringBuilder sb7 = new StringBuilder();
                C2303e c2303e4 = this.f27678e;
                sb7.append((Object) C5060e.vip(c2303e4.f5823e));
                sb7.append("#isCaptureProgressSupported");
                String sb8 = sb7.toString();
                boolean z2 = false;
                try {
                    try {
                        Trace.beginSection(sb8);
                        boolean signatures = Build.VERSION.SDK_INT >= 34 ? AbstractC5666e.signatures(c2303e4.f5820e, c2303e4.f5821e) : false;
                        Trace.endSection();
                        z2 = signatures;
                    } finally {
                    }
                } catch (Throwable th4) {
                    Log.w("CXCP", "Failed to get " + sb8 + "! Caching false and ignoring exception.", th4);
                }
                return Boolean.valueOf(z2);
        }
    }
}
