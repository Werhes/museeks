package defpackage;

import android.util.Log;
import j$.util.Objects;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1386e {
    public final C8331e ad;
    public final C0909e vip;

    /* JADX WARN: Type inference failed for: r2v1, types: [eٍؚؒ, java.lang.Object] */
    public C1386e(C8331e c8331e, C14461e c14461e) {
        this.ad = c8331e;
        ?? obj = new Object();
        obj.f3322e = null;
        obj.f3321e = null;
        obj.f3323e = c14461e;
        this.vip = obj;
    }

    public final String ad(String str) {
        String substring;
        C0909e c0909e = this.vip;
        synchronized (c0909e) {
            if (Objects.equals((String) c0909e.f3322e, str)) {
                return (String) c0909e.f3321e;
            }
            C14461e c14461e = (C14461e) c0909e.f3323e;
            C11984e c11984e = C0909e.f3319e;
            File file = new File((File) c14461e.f28588e, str);
            file.mkdirs();
            List pro = C14461e.pro(file.listFiles(c11984e));
            if (pro.isEmpty()) {
                substring = null;
                Log.w("FirebaseCrashlytics", "Unable to read App Quality Sessions session id.", null);
            } else {
                substring = ((File) Collections.min(pro, C0909e.f3318e)).getName().substring(4);
            }
            return substring;
        }
    }

    public final void vip(String str) {
        C0909e c0909e = this.vip;
        synchronized (c0909e) {
            if (!Objects.equals((String) c0909e.f3322e, str)) {
                C0909e.m415extends((C14461e) c0909e.f3323e, str, (String) c0909e.f3321e);
                c0909e.f3322e = str;
            }
        }
    }
}
