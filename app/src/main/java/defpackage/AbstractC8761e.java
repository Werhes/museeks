package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8761e implements InterfaceC1755e, InterfaceC13215e, InterfaceC7557e, InterfaceC13961e, InterfaceC13984e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13475e f17665e;

    public AbstractC8761e(Function0 function0) {
        C13475e c13475e = null;
        C13475e c13475e2 = function0 instanceof C13475e ? (C13475e) function0 : null;
        if (c13475e2 != null) {
            c13475e = c13475e2;
        } else if (function0 != null) {
            c13475e = AbstractC2426e.vip(null, function0);
        }
        this.f17665e = c13475e;
    }

    public abstract InterfaceC13984e adcel();

    public abstract boolean admob();

    public abstract InterfaceC7227e advert();

    public abstract boolean amazon();

    /* renamed from: class, reason: not valid java name */
    public abstract AbstractC8761e mo2501class(boolean z);

    public abstract AbstractC8761e crashlytics();

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC8761e) && AbstractC0426e.purchase(C6114e.f12846e, this, (InterfaceC9905e) obj);
    }

    public abstract AbstractC8761e firebase(boolean z);

    public int hashCode() {
        InterfaceC0861e isVip = isVip();
        return ((signatures().hashCode() + ((isVip != null ? isVip.hashCode() : 0) * 31)) * 31) + (startapp() ? 1231 : 1237);
    }

    /* renamed from: interface, reason: not valid java name */
    public abstract AbstractC8761e mo2502interface();

    public abstract boolean isPro();

    public abstract boolean subs();

    public String toString() {
        return C1400e.m597class(this, false);
    }
}
