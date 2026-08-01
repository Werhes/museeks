package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2107e implements InterfaceC6755e, AutoCloseable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C1239e f5443e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final List f5444e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final LinkedHashMap f5445e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final ArrayList f5446e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final LinkedHashMap f5447e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C9485e f5448e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final ArrayList f5449e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f5450e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C11498e f5442e = AbstractC14430e.license(0);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C11498e f5436e = AbstractC14430e.license(0);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C11498e f5441e = AbstractC14430e.license(0);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C11498e f5435e = AbstractC14430e.license(0);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C11498e f5434e = AbstractC14430e.license(0);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final List f5437e = AbstractC6874e.startapp(C15802e.f31139e, C15802e.f31122e);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C11797e f5439e = new C11797e(20);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final List f5440e = AbstractC6874e.startapp(new C0299e(0), new C0299e(34));

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C11797e f5438e = new C11797e(21);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0114 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [eْۨٝ] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2107e(defpackage.InterfaceC2531e r28, defpackage.C9485e r29, defpackage.C14595e r30) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2107e.<init>(eُّؔ, eٍٕٛ, eًٔۜ):void");
    }

    public final C12550e ad(int i) {
        Object obj;
        Iterator it = this.f5449e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C12550e) obj).ad == i) {
                break;
            }
        }
        return (C12550e) obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Iterator it = ((C15240e) this.f5443e.values()).iterator();
        while (it.hasNext()) {
            AutoCloseable autoCloseable = (AbstractC7905e) it.next();
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else {
                if (!(autoCloseable instanceof ExecutorService)) {
                    throw new IllegalArgumentException();
                }
                AbstractC6418e.smaato((ExecutorService) autoCloseable);
            }
        }
    }

    public final C2740e license(int i) {
        Object obj;
        Iterator it = this.f5445e.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((C12550e) ((Map.Entry) obj).getValue()).ad == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (C2740e) entry.getKey();
        }
        return null;
    }

    public final String toString() {
        return "StreamGraph(" + this.f5445e + ')';
    }
}
