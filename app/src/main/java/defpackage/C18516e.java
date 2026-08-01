package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۧۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18516e implements InterfaceC16460e, Iterable, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f36301e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public HashMap f36303e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f36304e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f36305e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C3123e f36306e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f36307e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public boolean f36310e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int[] f36309e = new int[0];

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object[] f36302e = new Object[0];

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f36311e = new Object();

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public ArrayList f36308e = new ArrayList();

    public final C14479e adcel() {
        if (this.f36310e) {
            AbstractC1889e.ad("Cannot start a writer when another writer is pending");
        }
        if (this.f36301e > 0) {
            AbstractC1889e.ad("Cannot start a writer when a reader is pending");
        }
        this.f36310e = true;
        this.f36305e++;
        return new C14479e(this);
    }

    public final boolean advert(C3155e c3155e) {
        int purchase;
        return c3155e.ad() && (purchase = AbstractC2855e.purchase(this.f36308e, c3155e.ad, this.f36304e)) >= 0 && AbstractC7890e.billing(this.f36308e.get(purchase), c3155e);
    }

    public final int appmetrica(C3155e c3155e) {
        if (this.f36310e) {
            AbstractC1889e.ad("Use active SlotWriter to determine anchor location instead");
        }
        if (!c3155e.ad()) {
            AbstractC6536e.ad("Anchor refers to a group that was removed");
        }
        return c3155e.ad;
    }

    public final void billing() {
        this.f36303e = new HashMap();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C16343e(this, 0, this.f36304e);
    }

    public final AbstractC3091e smaato(int i) {
        int i2;
        ArrayList arrayList;
        int purchase;
        HashMap hashMap = this.f36303e;
        if (hashMap != null) {
            if (this.f36310e) {
                AbstractC1889e.ad("use active SlotWriter to crate an anchor for location instead");
            }
            C3155e c3155e = (i < 0 || i >= (i2 = this.f36304e) || (purchase = AbstractC2855e.purchase((arrayList = this.f36308e), i, i2)) < 0) ? null : (C3155e) arrayList.get(purchase);
            if (c3155e != null) {
                return (AbstractC3091e) hashMap.get(c3155e);
            }
        }
        return null;
    }

    public final C0690e startapp() {
        if (this.f36310e) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f36301e++;
        return new C0690e(this);
    }

    public final void yandex(C14995e c14995e) {
        C14479e adcel = adcel();
        try {
            adcel.amazon(adcel.pro, new C11213e(14, c14995e));
            adcel.m3815goto();
            Unit unit = Unit.INSTANCE;
            adcel.appmetrica(true);
        } catch (Throwable th) {
            adcel.appmetrica(false);
            throw th;
        }
    }
}
