package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10159e implements InterfaceC11152e {
    public ArrayList Signature;
    public final ArrayList ad;
    public CharSequence adcel;
    public final AbstractC15958e admob;
    public CharSequence advert;
    public ArrayList amazon;
    public int appmetrica;
    public boolean billing;
    public int license;
    public boolean loadAd;
    public int metrica;
    public int mopub;
    public int purchase;
    public int remoteconfig;
    public ArrayList smaato;
    public int startapp;
    public boolean subscription;
    public int vip;
    public String yandex;

    public C10159e(AbstractC15958e abstractC15958e) {
        abstractC15958e.m4058interface();
        C2386e c2386e = abstractC15958e.isVip;
        if (c2386e != null) {
            c2386e.f6096e.getClassLoader();
        }
        this.ad = new ArrayList();
        this.loadAd = false;
        this.remoteconfig = -1;
        this.admob = abstractC15958e;
    }

    @Override // defpackage.InterfaceC11152e
    public final boolean ad(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.billing) {
            return true;
        }
        this.admob.license.add(this);
        return true;
    }

    public final int appmetrica(boolean z, boolean z2) {
        if (this.subscription) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC15958e.m4045native(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C13947e());
            billing("  ", printWriter, true);
            printWriter.close();
        }
        this.subscription = true;
        boolean z3 = this.billing;
        AbstractC15958e abstractC15958e = this.admob;
        if (z3) {
            this.remoteconfig = abstractC15958e.mopub.getAndIncrement();
        } else {
            this.remoteconfig = -1;
        }
        if (z2) {
            abstractC15958e.inmobi(this, z);
        }
        return this.remoteconfig;
    }

    public final void billing(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.yandex);
            printWriter.print(" mIndex=");
            printWriter.print(this.remoteconfig);
            printWriter.print(" mCommitted=");
            printWriter.println(this.subscription);
            if (this.purchase != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.purchase));
            }
            if (this.vip != 0 || this.metrica != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.vip));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.metrica));
            }
            if (this.license != 0 || this.appmetrica != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.license));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.appmetrica));
            }
            if (this.startapp != 0 || this.adcel != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.startapp));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.adcel);
            }
            if (this.mopub != 0 || this.advert != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mopub));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.advert);
            }
        }
        ArrayList arrayList = this.ad;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7659e c7659e = (C7659e) arrayList.get(i);
            switch (c7659e.ad) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c7659e.ad;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c7659e.vip);
            if (z) {
                if (c7659e.license != 0 || c7659e.appmetrica != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c7659e.license));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c7659e.appmetrica));
                }
                if (c7659e.purchase != 0 || c7659e.billing != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c7659e.purchase));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c7659e.billing));
                }
            }
        }
    }

    public final void license() {
        ArrayList arrayList = this.ad;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            C7659e c7659e = (C7659e) arrayList.get(size);
            if (c7659e.metrica) {
                if (c7659e.ad == 8) {
                    c7659e.metrica = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i = c7659e.vip.f35092e;
                    c7659e.ad = 2;
                    c7659e.metrica = false;
                    for (int i2 = size - 1; i2 >= 0; i2--) {
                        C7659e c7659e2 = (C7659e) arrayList.get(i2);
                        if (c7659e2.metrica && c7659e2.vip.f35092e == i) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final void metrica(int i) {
        if (this.billing) {
            if (AbstractC15958e.m4045native(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.ad;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C7659e c7659e = (C7659e) arrayList.get(i2);
                AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e = c7659e.vip;
                if (abstractComponentCallbacksC17875e != null) {
                    abstractComponentCallbacksC17875e.f35097e += i;
                    if (AbstractC15958e.m4045native(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c7659e.vip + " to " + c7659e.vip.f35097e);
                    }
                }
            }
        }
    }

    public final void purchase(int i, AbstractComponentCallbacksC17875e abstractComponentCallbacksC17875e, String str, int i2) {
        String str2 = abstractComponentCallbacksC17875e.f35069e;
        if (str2 != null) {
            AbstractC11220e.metrica(abstractComponentCallbacksC17875e, str2);
        }
        Class<?> cls = abstractComponentCallbacksC17875e.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC17875e.f35089e;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(abstractComponentCallbacksC17875e);
                sb.append(": was ");
                throw new IllegalStateException(AbstractC8647e.ads(sb, abstractComponentCallbacksC17875e.f35089e, " now ", str));
            }
            abstractComponentCallbacksC17875e.f35089e = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC17875e + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC17875e.f35104e;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC17875e + ": was " + abstractComponentCallbacksC17875e.f35104e + " now " + i);
            }
            abstractComponentCallbacksC17875e.f35104e = i;
            abstractComponentCallbacksC17875e.f35092e = i;
        }
        vip(new C7659e(i2, abstractComponentCallbacksC17875e));
        abstractComponentCallbacksC17875e.f35112e = this.admob;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.remoteconfig >= 0) {
            sb.append(" #");
            sb.append(this.remoteconfig);
        }
        if (this.yandex != null) {
            sb.append(" ");
            sb.append(this.yandex);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void vip(C7659e c7659e) {
        this.ad.add(c7659e);
        c7659e.license = this.vip;
        c7659e.appmetrica = this.metrica;
        c7659e.purchase = this.license;
        c7659e.billing = this.appmetrica;
    }
}
