package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8531e implements InterfaceC5482e {
    public static final HashSet adcel = new HashSet();
    public final File ad;
    public final HashMap appmetrica;
    public final boolean billing;
    public final C16911e license;
    public final C2532e metrica;
    public final Random purchase;
    public C17349e startapp;
    public final C5889e vip;
    public long yandex;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eِّؔ] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eِؒۜ, java.lang.Object] */
    public C8531e(File file, C5889e c5889e, C5455e c5455e) {
        boolean add;
        ?? obj = new Object();
        obj.f6388e = new HashMap();
        obj.f6386e = new SparseArray();
        obj.f6385e = new SparseBooleanArray();
        obj.f6387e = new SparseBooleanArray();
        ?? obj2 = new Object();
        obj2.f23072e = c5455e;
        obj2.f23070e = new SparseArray();
        C12344e c12344e = new C12344e(new File(file, "cached_content_index.exi"));
        obj.f6384e = obj2;
        obj.f6389e = c12344e;
        C16911e c16911e = new C16911e(1, c5455e);
        synchronized (C8531e.class) {
            add = adcel.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.ad = file;
        this.vip = c5889e;
        this.metrica = obj;
        this.license = c16911e;
        this.appmetrica = new HashMap();
        this.purchase = new Random();
        this.billing = true;
        this.yandex = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C13323e(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.IOException, eٗۢٚ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.IOException, eٗۢٚ] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.IOException, eٗۢٚ] */
    public static void ad(C8531e c8531e) {
        C16911e c16911e = c8531e.license;
        C2532e c2532e = c8531e.metrica;
        File file = c8531e.ad;
        if (!file.exists()) {
            try {
                appmetrica(file);
            } catch (C17349e e) {
                c8531e.startapp = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            AbstractC2803e.purchase("SimpleCache", str);
            c8531e.startapp = new IOException(str);
            return;
        }
        long adcel2 = adcel(listFiles);
        c8531e.yandex = adcel2;
        if (adcel2 == -1) {
            try {
                c8531e.yandex = purchase(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                AbstractC2803e.billing("SimpleCache", str2, e2);
                c8531e.startapp = new IOException(str2, e2);
                return;
            }
        }
        try {
            c2532e.m883else(c8531e.yandex);
            if (c16911e != null) {
                c16911e.premium(c8531e.yandex);
                HashMap tapsense = c16911e.tapsense();
                c8531e.startapp(file, true, listFiles, tapsense);
                c16911e.m4220this(tapsense.keySet());
            } else {
                c8531e.startapp(file, true, listFiles, null);
            }
            AbstractC7014e it = AbstractC12614e.admob(((HashMap) c2532e.f6388e).keySet()).iterator();
            while (it.hasNext()) {
                c2532e.m891e((String) it.next());
            }
            try {
                c2532e.m907e();
            } catch (IOException e3) {
                AbstractC2803e.billing("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            AbstractC2803e.billing("SimpleCache", str3, e4);
            c8531e.startapp = new IOException(str3, e4);
        }
    }

    public static long adcel(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                } catch (NumberFormatException unused) {
                    AbstractC2803e.purchase("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static void appmetrica(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        AbstractC2803e.purchase("SimpleCache", str);
        throw new IOException(str);
    }

    public static long purchase(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, AbstractC10257e.adcel(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public final void advert(AbstractC2416e abstractC2416e) {
        String str = abstractC2416e.f6202e;
        long j = abstractC2416e.f6199e;
        File file = abstractC2416e.f6198e;
        C2532e c2532e = this.metrica;
        C15514e m928package = c2532e.m928package(str);
        if (m928package == null || !m928package.metrica.remove(abstractC2416e)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        C16911e c16911e = this.license;
        if (c16911e != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) c16911e.f33136e).getClass();
                try {
                    ((C5455e) c16911e.f33137e).getWritableDatabase().delete((String) c16911e.f33136e, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new IOException(e);
                }
            } catch (IOException unused) {
                AbstractC17861e.applovin("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        c2532e.m891e(m928package.vip);
        ArrayList arrayList = (ArrayList) this.appmetrica.get(abstractC2416e.f6202e);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C5889e c5889e = (C5889e) arrayList.get(size);
                c5889e.ad.remove(abstractC2416e);
                c5889e.vip -= j;
            }
        }
        C5889e c5889e2 = this.vip;
        c5889e2.ad.remove(abstractC2416e);
        c5889e2.vip -= j;
    }

    public final synchronized C7747e amazon(String str, long j, long j2) {
        int i;
        license();
        C7747e yandex = yandex(str, j, j2);
        if (yandex.f6201e) {
            return loadAd(str, yandex);
        }
        C15514e m932static = this.metrica.m932static(str);
        long j3 = yandex.f6199e;
        ArrayList arrayList = m932static.license;
        while (i < arrayList.size()) {
            C2384e c2384e = (C2384e) arrayList.get(i);
            long j4 = c2384e.ad;
            if (j4 <= j) {
                long j5 = c2384e.vip;
                i = (j5 != -1 && j4 + j5 <= j) ? i + 1 : 0;
                return null;
            }
            if (j3 != -1 && j + j3 <= j4) {
            }
            return null;
        }
        arrayList.add(new C2384e(j, j3));
        return yandex;
    }

    public final synchronized C4660e billing(String str) {
        C15514e m928package;
        m928package = this.metrica.m928package(str);
        return m928package != null ? m928package.appmetrica : C4660e.metrica;
    }

    public final synchronized void license() {
        C17349e c17349e = this.startapp;
        if (c17349e != null) {
            throw c17349e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Type inference failed for: r10v0, types: [eًؗۗ, eؙؔٗ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C7747e loadAd(java.lang.String r20, defpackage.C7747e r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            long r2 = r1.f6199e
            java.io.File r4 = r1.f6198e
            boolean r5 = r0.billing
            if (r5 != 0) goto Ld
            return r1
        Ld:
            r4.getClass()
            java.lang.String r7 = r4.getName()
            long r8 = r1.f6199e
            long r14 = java.lang.System.currentTimeMillis()
            r5 = 1
            eَٗؔ r6 = r0.license
            if (r6 == 0) goto L2e
            r10 = r14
            r6.m4215extends(r7, r8, r10)     // Catch: java.io.IOException -> L24
            goto L2c
        L24:
            r14 = r10
            java.lang.String r6 = "SimpleCache"
            java.lang.String r7 = "Failed to update index with new touch timestamp."
            defpackage.AbstractC2803e.smaato(r6, r7)
        L2c:
            r6 = 0
            goto L2f
        L2e:
            r6 = r5
        L2f:
            eِّؔ r7 = r0.metrica
            r8 = r20
            eَٕٗ r7 = r7.m928package(r8)
            r7.getClass()
            java.util.TreeSet r8 = r7.metrica
            boolean r9 = r8.remove(r1)
            defpackage.AbstractC2301e.subscription(r9)
            r4.getClass()
            if (r6 == 0) goto L7b
            java.io.File r10 = r4.getParentFile()
            r10.getClass()
            long r12 = r1.f6200e
            int r11 = r7.ad
            java.io.File r6 = defpackage.C7747e.metrica(r10, r11, r12, r14)
            boolean r7 = r4.renameTo(r6)
            if (r7 == 0) goto L60
            r18 = r6
            goto L7d
        L60:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Failed to rename "
            r7.<init>(r9)
            r7.append(r4)
            java.lang.String r9 = " to "
            r7.append(r9)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "CachedContent"
            defpackage.AbstractC2803e.smaato(r7, r6)
        L7b:
            r18 = r4
        L7d:
            boolean r4 = r1.f6201e
            defpackage.AbstractC2301e.subscription(r4)
            eًؗۗ r10 = new eًؗۗ
            java.lang.String r11 = r1.f6202e
            long r12 = r1.f6200e
            r16 = r14
            long r14 = r1.f6199e
            r10.<init>(r11, r12, r14, r16, r18)
            r8.add(r10)
            java.util.HashMap r4 = r0.appmetrica
            java.lang.String r6 = r1.f6202e
            java.lang.Object r4 = r4.get(r6)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto Lbb
            int r6 = r4.size()
            int r6 = r6 - r5
        La3:
            if (r6 < 0) goto Lbb
            java.lang.Object r5 = r4.get(r6)
            eؘۚ٘ r5 = (defpackage.C5889e) r5
            java.util.TreeSet r7 = r5.ad
            r7.remove(r1)
            long r7 = r5.vip
            long r7 = r7 - r2
            r5.vip = r7
            r5.vip(r0, r10)
            int r6 = r6 + (-1)
            goto La3
        Lbb:
            eؘۚ٘ r4 = r0.vip
            java.util.TreeSet r5 = r4.ad
            r5.remove(r1)
            long r5 = r4.vip
            long r5 = r5 - r2
            r4.vip = r5
            r4.vip(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C8531e.loadAd(java.lang.String, eًؗۗ):eًؗۗ");
    }

    public final synchronized void metrica(String str, C18540e c18540e) {
        license();
        C2532e c2532e = this.metrica;
        C15514e m932static = c2532e.m932static(str);
        C4660e c4660e = m932static.appmetrica;
        C4660e ad = c4660e.ad(c18540e);
        m932static.appmetrica = ad;
        if (!ad.equals(c4660e)) {
            ((InterfaceC14610e) c2532e.f6384e).yandex(m932static);
        }
        try {
            this.metrica.m907e();
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    public final synchronized void mopub(C7747e c7747e) {
        C15514e m928package = this.metrica.m928package(c7747e.f6202e);
        m928package.getClass();
        long j = c7747e.f6200e;
        ArrayList arrayList = m928package.license;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C2384e) arrayList.get(i)).ad == j) {
                arrayList.remove(i);
                this.metrica.m891e(m928package.vip);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void smaato() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(((HashMap) this.metrica.f6388e).values()).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C15514e) it.next()).metrica.iterator();
            while (it2.hasNext()) {
                AbstractC2416e abstractC2416e = (AbstractC2416e) it2.next();
                File file = abstractC2416e.f6198e;
                file.getClass();
                if (file.length() != abstractC2416e.f6199e) {
                    arrayList.add(abstractC2416e);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            advert((AbstractC2416e) arrayList.get(i));
        }
    }

    public final void startapp(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                startapp(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                C1544e c1544e = map != null ? (C1544e) map.remove(name) : null;
                if (c1544e != null) {
                    j = c1544e.ad;
                    j2 = c1544e.vip;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                C7747e vip = C7747e.vip(file2, j, j2, this.metrica);
                if (vip != null) {
                    vip(vip);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void vip(C7747e c7747e) {
        String str = c7747e.f6202e;
        this.metrica.m932static(str).metrica.add(c7747e);
        ArrayList arrayList = (ArrayList) this.appmetrica.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C5889e) arrayList.get(size)).vip(this, c7747e);
            }
        }
        this.vip.vip(this, c7747e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [eًؗۗ, eؙؔٗ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eؙؔٗ] */
    public final C7747e yandex(String str, long j, long j2) {
        C7747e c7747e;
        long j3;
        C15514e m928package = this.metrica.m928package(str);
        if (m928package == null) {
            return new AbstractC2416e(str, j, j2, -9223372036854775807L, null);
        }
        while (true) {
            AbstractC2416e abstractC2416e = new AbstractC2416e(m928package.vip, j, -1L, -9223372036854775807L, null);
            TreeSet treeSet = m928package.metrica;
            c7747e = (C7747e) treeSet.floor(abstractC2416e);
            if (c7747e == null || c7747e.f6200e + c7747e.f6199e <= j) {
                C7747e c7747e2 = (C7747e) treeSet.ceiling(abstractC2416e);
                if (c7747e2 != null) {
                    long j4 = c7747e2.f6200e - j;
                    if (j2 != -1) {
                        j4 = Math.min(j4, j2);
                    }
                    j3 = j4;
                } else {
                    j3 = j2;
                }
                c7747e = new AbstractC2416e(m928package.vip, j, j3, -9223372036854775807L, null);
            }
            if (!c7747e.f6201e) {
                break;
            }
            File file = c7747e.f6198e;
            file.getClass();
            if (file.length() == c7747e.f6199e) {
                break;
            }
            smaato();
        }
        return c7747e;
    }
}
