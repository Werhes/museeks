package defpackage;

import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0863e {
    public static final C10039e ad = new Object();

    public static final void ad(C13770e c13770e, int i) {
        c13770e.m3671package(1257244356);
        if (i == 0 && c13770e.ads()) {
            c13770e.m3659default();
        } else {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = C7462e.f15237e;
                c13770e.m3682throws(m3681throw);
            }
            Function0 function0 = (Function0) ((InterfaceC5261e) m3681throw);
            c13770e.m3672private(-1115894518);
            c13770e.m3672private(1886828752);
            if (!(c13770e.ad instanceof C9626e)) {
                AbstractC5546e.purchase();
                throw null;
            }
            c13770e.m3677super();
            if (c13770e.f27292implements) {
                c13770e.mopub(new C9598e(1, function0));
            } else {
                c13770e.m3684volatile();
            }
            AbstractC1786e.isPro(c13770e, true, false, false);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C8436e(i);
        }
    }

    public static void adcel(int i, C11325e c11325e, C0724e c0724e, C11325e c11325e2, boolean z) {
        float f = c11325e2.f22744instanceof;
        C9399e c9399e = c11325e2.f22758this;
        int appmetrica = c9399e.appmetrica() + c9399e.purchase.license();
        C9399e c9399e2 = c11325e2.f22737extends;
        int license = c9399e2.purchase.license() - c9399e2.appmetrica();
        if (license >= appmetrica) {
            int admob = c11325e2.admob();
            if (c11325e2.f22752return != 8) {
                int i2 = c11325e2.subscription;
                if (i2 == 2) {
                    admob = (int) (c11325e2.f22744instanceof * 0.5f * (c11325e instanceof C17688e ? c11325e.admob() : c11325e.f22730case.admob()));
                } else if (i2 == 0) {
                    admob = license - appmetrica;
                }
                admob = Math.max(c11325e2.signatures, admob);
                int i3 = c11325e2.tapsense;
                if (i3 > 0) {
                    admob = Math.min(i3, admob);
                }
            }
            int i4 = appmetrica + ((int) ((f * ((license - appmetrica) - admob)) + 0.5f));
            c11325e2.m3194native(i4, admob + i4);
            billing(i + 1, c0724e, c11325e2, z);
        }
    }

    public static void advert(int i, C11325e c11325e, C0724e c0724e, C11325e c11325e2) {
        float f = c11325e2.f22753static;
        C9399e c9399e = c11325e2.f22746native;
        int appmetrica = c9399e.appmetrica() + c9399e.purchase.license();
        C9399e c9399e2 = c11325e2.f22759throw;
        int license = c9399e2.purchase.license() - c9399e2.appmetrica();
        if (license >= appmetrica) {
            int mopub = c11325e2.mopub();
            if (c11325e2.f22752return != 8) {
                int i2 = c11325e2.remoteconfig;
                if (i2 == 2) {
                    mopub = (int) (f * 0.5f * (c11325e instanceof C17688e ? c11325e.mopub() : c11325e.f22730case.mopub()));
                } else if (i2 == 0) {
                    mopub = license - appmetrica;
                }
                mopub = Math.max(c11325e2.inmobi, mopub);
                int i3 = c11325e2.isPro;
                if (i3 > 0) {
                    mopub = Math.min(i3, mopub);
                }
            }
            int i4 = appmetrica + ((int) ((f * ((license - appmetrica) - mopub)) + 0.5f));
            c11325e2.m3193extends(i4, mopub + i4);
            smaato(i + 1, c0724e, c11325e2);
        }
    }

    public static final Object appmetrica(AbstractC0641e abstractC0641e, C4790e c4790e) {
        if (abstractC0641e.advert(c4790e)) {
            return abstractC0641e.mopub(c4790e);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, eَؕٔ] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, eَؕٔ] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, eَؕٔ] */
    public static void billing(int i, C0724e c0724e, C11325e c11325e, boolean z) {
        C9399e c9399e;
        C9399e c9399e2;
        boolean z2;
        C9399e c9399e3;
        C9399e c9399e4;
        if (c11325e.smaato) {
            return;
        }
        if (!(c11325e instanceof C17688e) && c11325e.applovin() && metrica(c11325e)) {
            C17688e.m4379final(c11325e, c0724e, new Object());
        }
        C9399e startapp = c11325e.startapp(2);
        C9399e startapp2 = c11325e.startapp(4);
        int license = startapp.license();
        int license2 = startapp2.license();
        HashSet hashSet = startapp.ad;
        if (hashSet != null && startapp.metrica) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C9399e c9399e5 = (C9399e) it.next();
                C11325e c11325e2 = c9399e5.license;
                int i2 = i + 1;
                boolean metrica = metrica(c11325e2);
                C9399e c9399e6 = c11325e2.f22758this;
                C9399e c9399e7 = c11325e2.f22737extends;
                if (c11325e2.applovin() && metrica) {
                    z2 = true;
                    C17688e.m4379final(c11325e2, c0724e, new Object());
                } else {
                    z2 = true;
                }
                boolean z3 = ((c9399e5 == c9399e6 && (c9399e4 = c9399e7.purchase) != null && c9399e4.metrica) || (c9399e5 == c9399e7 && (c9399e3 = c9399e6.purchase) != null && c9399e3.metrica)) ? z2 : false;
                int i3 = c11325e2.f22751public[0];
                if (i3 != 3 || metrica) {
                    if (!c11325e2.applovin()) {
                        if (c9399e5 == c9399e6 && c9399e7.purchase == null) {
                            int appmetrica = c9399e6.appmetrica() + license;
                            c11325e2.m3194native(appmetrica, c11325e2.admob() + appmetrica);
                            billing(i2, c0724e, c11325e2, z);
                        } else if (c9399e5 == c9399e7 && c9399e6.purchase == null) {
                            int appmetrica2 = license - c9399e7.appmetrica();
                            c11325e2.m3194native(appmetrica2 - c11325e2.admob(), appmetrica2);
                            billing(i2, c0724e, c11325e2, z);
                        } else if (z3 && !c11325e2.inmobi()) {
                            startapp(i2, c0724e, c11325e2, z);
                        }
                    }
                } else if (i3 == 3 && c11325e2.tapsense >= 0 && c11325e2.signatures >= 0 && (c11325e2.f22752return == 8 || (c11325e2.subscription == 0 && c11325e2.f22755super == 0.0f))) {
                    if (!c11325e2.inmobi() && !c11325e2.f22732class && z3 && !c11325e2.inmobi()) {
                        adcel(i2, c11325e, c0724e, c11325e2, z);
                    }
                }
            }
        }
        if (c11325e instanceof C0913e) {
            return;
        }
        HashSet hashSet2 = startapp2.ad;
        if (hashSet2 != null && startapp2.metrica) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C9399e c9399e8 = (C9399e) it2.next();
                C11325e c11325e3 = c9399e8.license;
                int i4 = i + 1;
                boolean metrica2 = metrica(c11325e3);
                C9399e c9399e9 = c11325e3.f22758this;
                C9399e c9399e10 = c11325e3.f22737extends;
                if (c11325e3.applovin() && metrica2) {
                    C17688e.m4379final(c11325e3, c0724e, new Object());
                }
                boolean z4 = (c9399e8 == c9399e9 && (c9399e2 = c9399e10.purchase) != null && c9399e2.metrica) || (c9399e8 == c9399e10 && (c9399e = c9399e9.purchase) != null && c9399e.metrica);
                int i5 = c11325e3.f22751public[0];
                if (i5 != 3 || metrica2) {
                    if (!c11325e3.applovin()) {
                        if (c9399e8 == c9399e9 && c9399e10.purchase == null) {
                            int appmetrica3 = c9399e9.appmetrica() + license2;
                            c11325e3.m3194native(appmetrica3, c11325e3.admob() + appmetrica3);
                            billing(i4, c0724e, c11325e3, z);
                        } else if (c9399e8 == c9399e10 && c9399e9.purchase == null) {
                            int appmetrica4 = license2 - c9399e10.appmetrica();
                            c11325e3.m3194native(appmetrica4 - c11325e3.admob(), appmetrica4);
                            billing(i4, c0724e, c11325e3, z);
                        } else if (z4 && !c11325e3.inmobi()) {
                            startapp(i4, c0724e, c11325e3, z);
                        }
                    }
                } else if (i5 == 3 && c11325e3.tapsense >= 0 && c11325e3.signatures >= 0) {
                    if (c11325e3.f22752return == 8 || (c11325e3.subscription == 0 && c11325e3.f22755super == 0.0f)) {
                        if (!c11325e3.inmobi() && !c11325e3.f22732class && z4 && !c11325e3.inmobi()) {
                            adcel(i4, c11325e, c0724e, c11325e3, z);
                        }
                    }
                }
            }
        }
        c11325e.smaato = true;
    }

    public static C12698e license(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new C12698e(AbstractC11815e.applovin(view));
        }
        return null;
    }

    public static boolean metrica(C11325e c11325e) {
        int[] iArr = c11325e.f22751public;
        int i = iArr[0];
        int i2 = iArr[1];
        C11325e c11325e2 = c11325e.f22730case;
        C17688e c17688e = c11325e2 != null ? (C17688e) c11325e2 : null;
        if (c17688e != null) {
            int i3 = c17688e.f22751public[0];
        }
        if (c17688e != null) {
            int i4 = c17688e.f22751public[1];
        }
        boolean z = i == 1 || c11325e.ads() || i == 2 || (i == 3 && c11325e.subscription == 0 && c11325e.f22755super == 0.0f && c11325e.pro(0)) || (i == 3 && c11325e.subscription == 1 && c11325e.signatures(0, c11325e.admob()));
        boolean z2 = i2 == 1 || c11325e.premium() || i2 == 2 || (i2 == 3 && c11325e.remoteconfig == 0 && c11325e.f22755super == 0.0f && c11325e.pro(1)) || (i2 == 3 && c11325e.remoteconfig == 1 && c11325e.signatures(1, c11325e.mopub()));
        return (c11325e.f22755super > 0.0f && (z || z2)) || (z && z2);
    }

    public static void mopub(int i, C0724e c0724e, C11325e c11325e) {
        float f = c11325e.f22753static;
        C9399e c9399e = c11325e.f22746native;
        int license = c9399e.purchase.license();
        C9399e c9399e2 = c11325e.f22759throw;
        int license2 = c9399e2.purchase.license();
        int appmetrica = c9399e.appmetrica() + license;
        int appmetrica2 = license2 - c9399e2.appmetrica();
        if (license == license2) {
            f = 0.5f;
        } else {
            license = appmetrica;
            license2 = appmetrica2;
        }
        int mopub = c11325e.mopub();
        int i2 = (license2 - license) - mopub;
        if (license > license2) {
            i2 = (license - license2) - mopub;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = license + i3;
        int i5 = i4 + mopub;
        if (license > license2) {
            i4 = license - i3;
            i5 = i4 - mopub;
        }
        c11325e.m3193extends(i4, i5);
        smaato(i + 1, c0724e, c11325e);
    }

    public static final Object purchase(AbstractC0641e abstractC0641e, C4790e c4790e, int i) {
        abstractC0641e.loadAd(c4790e);
        C5152e c5152e = abstractC0641e.f2878e;
        C1808e c1808e = c4790e.license;
        c5152e.getClass();
        C15497e c15497e = c5152e.ad;
        if (!c1808e.f4881e) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = c15497e.get(c1808e);
        if (i >= (obj == null ? 0 : ((List) obj).size())) {
            return null;
        }
        abstractC0641e.loadAd(c4790e);
        if (!c1808e.f4881e) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj2 = c15497e.get(c1808e);
        if (obj2 != null) {
            return c4790e.ad(((List) obj2).get(i));
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Object, eَؕٔ] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object, eَؕٔ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, eَؕٔ] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object, eَؕٔ] */
    public static void smaato(int i, C0724e c0724e, C11325e c11325e) {
        C9399e c9399e;
        C9399e c9399e2;
        C9399e c9399e3;
        C9399e c9399e4;
        if (c11325e.amazon) {
            return;
        }
        if (!(c11325e instanceof C17688e) && c11325e.applovin() && metrica(c11325e)) {
            C17688e.m4379final(c11325e, c0724e, new Object());
        }
        C9399e startapp = c11325e.startapp(3);
        C9399e startapp2 = c11325e.startapp(5);
        int license = startapp.license();
        int license2 = startapp2.license();
        HashSet hashSet = startapp.ad;
        if (hashSet != null && startapp.metrica) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C9399e c9399e5 = (C9399e) it.next();
                C11325e c11325e2 = c9399e5.license;
                int i2 = i + 1;
                boolean metrica = metrica(c11325e2);
                C9399e c9399e6 = c11325e2.f22746native;
                C9399e c9399e7 = c11325e2.f22759throw;
                if (c11325e2.applovin() && metrica) {
                    C17688e.m4379final(c11325e2, c0724e, new Object());
                }
                boolean z = (c9399e5 == c9399e6 && (c9399e4 = c9399e7.purchase) != null && c9399e4.metrica) || (c9399e5 == c9399e7 && (c9399e3 = c9399e6.purchase) != null && c9399e3.metrica);
                int i3 = c11325e2.f22751public[1];
                if (i3 != 3 || metrica) {
                    if (!c11325e2.applovin()) {
                        if (c9399e5 == c9399e6 && c9399e7.purchase == null) {
                            int appmetrica = c9399e6.appmetrica() + license;
                            c11325e2.m3193extends(appmetrica, c11325e2.mopub() + appmetrica);
                            smaato(i2, c0724e, c11325e2);
                        } else if (c9399e5 == c9399e7 && c9399e6.purchase == null) {
                            int appmetrica2 = license - c9399e7.appmetrica();
                            c11325e2.m3193extends(appmetrica2 - c11325e2.mopub(), appmetrica2);
                            smaato(i2, c0724e, c11325e2);
                        } else if (z && !c11325e2.isPro()) {
                            mopub(i2, c0724e, c11325e2);
                        }
                    }
                } else if (i3 == 3 && c11325e2.isPro >= 0 && c11325e2.inmobi >= 0 && (c11325e2.f22752return == 8 || (c11325e2.remoteconfig == 0 && c11325e2.f22755super == 0.0f))) {
                    if (!c11325e2.isPro() && !c11325e2.f22732class && z && !c11325e2.isPro()) {
                        advert(i2, c11325e, c0724e, c11325e2);
                    }
                }
            }
        }
        char c = 1;
        if (c11325e instanceof C0913e) {
            return;
        }
        HashSet hashSet2 = startapp2.ad;
        if (hashSet2 != null && startapp2.metrica) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C9399e c9399e8 = (C9399e) it2.next();
                C11325e c11325e3 = c9399e8.license;
                int i4 = i + 1;
                boolean metrica2 = metrica(c11325e3);
                C9399e c9399e9 = c11325e3.f22746native;
                C9399e c9399e10 = c11325e3.f22759throw;
                if (c11325e3.applovin() && metrica2) {
                    C17688e.m4379final(c11325e3, c0724e, new Object());
                }
                boolean z2 = (c9399e8 == c9399e9 && (c9399e2 = c9399e10.purchase) != null && c9399e2.metrica) || (c9399e8 == c9399e10 && (c9399e = c9399e9.purchase) != null && c9399e.metrica);
                int i5 = c11325e3.f22751public[1];
                if (i5 != 3 || metrica2) {
                    if (!c11325e3.applovin()) {
                        if (c9399e8 == c9399e9 && c9399e10.purchase == null) {
                            int appmetrica3 = c9399e9.appmetrica() + license2;
                            c11325e3.m3193extends(appmetrica3, c11325e3.mopub() + appmetrica3);
                            smaato(i4, c0724e, c11325e3);
                        } else if (c9399e8 == c9399e10 && c9399e9.purchase == null) {
                            int appmetrica4 = license2 - c9399e10.appmetrica();
                            c11325e3.m3193extends(appmetrica4 - c11325e3.mopub(), appmetrica4);
                            smaato(i4, c0724e, c11325e3);
                        } else if (z2 && !c11325e3.isPro()) {
                            mopub(i4, c0724e, c11325e3);
                        }
                    }
                } else if (i5 == 3 && c11325e3.isPro >= 0 && c11325e3.inmobi >= 0 && (c11325e3.f22752return == 8 || (c11325e3.remoteconfig == 0 && c11325e3.f22755super == 0.0f))) {
                    if (!c11325e3.isPro() && !c11325e3.f22732class && z2 && !c11325e3.isPro()) {
                        advert(i4, c11325e, c0724e, c11325e3);
                    }
                }
            }
        }
        C9399e startapp3 = c11325e.startapp(6);
        if (startapp3.ad != null && startapp3.metrica) {
            int license3 = startapp3.license();
            Iterator it3 = startapp3.ad.iterator();
            while (it3.hasNext()) {
                C9399e c9399e11 = (C9399e) it3.next();
                C11325e c11325e4 = c9399e11.license;
                int i6 = i + 1;
                boolean metrica3 = metrica(c11325e4);
                C9399e c9399e12 = c11325e4.f22764while;
                if (c11325e4.applovin() && metrica3) {
                    C17688e.m4379final(c11325e4, c0724e, new Object());
                }
                if (c11325e4.f22751public[c == true ? 1 : 0] != 3 || metrica3) {
                    if (c11325e4.applovin()) {
                        continue;
                    } else if (c9399e11 == c9399e12) {
                        int appmetrica5 = c9399e11.appmetrica() + license3;
                        if (c11325e4.firebase) {
                            int i7 = appmetrica5 - c11325e4.f22748package;
                            int i8 = c11325e4.f22738final + i7;
                            c11325e4.f22749private = i7;
                            c11325e4.f22746native.advert(i7);
                            c11325e4.f22759throw.advert(i8);
                            c9399e12.advert(appmetrica5);
                            c11325e4.advert = c == true ? 1 : 0;
                        }
                        smaato(i6, c0724e, c11325e4);
                    }
                }
                c = 1;
            }
        }
        c11325e.amazon = true;
    }

    public static void startapp(int i, C0724e c0724e, C11325e c11325e, boolean z) {
        float f = c11325e.f22744instanceof;
        C9399e c9399e = c11325e.f22758this;
        int license = c9399e.purchase.license();
        C9399e c9399e2 = c11325e.f22737extends;
        int license2 = c9399e2.purchase.license();
        int appmetrica = c9399e.appmetrica() + license;
        int appmetrica2 = license2 - c9399e2.appmetrica();
        if (license == license2) {
            f = 0.5f;
        } else {
            license = appmetrica;
            license2 = appmetrica2;
        }
        int admob = c11325e.admob();
        int i2 = (license2 - license) - admob;
        if (license > license2) {
            i2 = (license - license2) - admob;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + license;
        int i4 = i3 + admob;
        if (license > license2) {
            i4 = i3 - admob;
        }
        c11325e.m3194native(i3, i4);
        billing(i + 1, c0724e, c11325e, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r6v2, types: [eؚؖٞ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.InterfaceC1618e r4, java.nio.channels.ReadableByteChannel r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C0772e
            if (r0 == 0) goto L13
            r0 = r6
            eؒؑٙ r0 = (defpackage.C0772e) r0
            int r1 = r0.f3129e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3129e = r1
            goto L18
        L13:
            eؒؑٙ r0 = new eؒؑٙ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f3127e
            int r1 = r0.f3129e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            eؚؖٞ r4 = r0.f3128e
            defpackage.AbstractC2003e.purchase(r6)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eؚؖٞ r6 = new eؚؖٞ
            r6.<init>()
            eّّۚ r1 = new eّّۚ
            r3 = 21
            r1.<init>(r6, r5, r3)
            r0.f3128e = r6
            r0.f3129e = r2
            java.lang.Object r4 = defpackage.AbstractC2206e.purchase(r4, r1, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r4 != r5) goto L4b
            return r5
        L4b:
            r4 = r6
        L4c:
            int r4 = r4.f8852e
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0863e.vip(eًؓؗ, java.nio.channels.ReadableByteChannel, eُؑ۠):java.lang.Object");
    }

    public static final boolean yandex(InterfaceC2209e interfaceC2209e) {
        if (interfaceC2209e instanceof C4736e) {
            return true;
        }
        if (!(interfaceC2209e instanceof AbstractC5918e)) {
            return false;
        }
        ArrayList arrayList = ((AbstractC5918e) interfaceC2209e).vip;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (yandex((InterfaceC2209e) it.next())) {
                return true;
            }
        }
        return false;
    }
}
