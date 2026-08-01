package defpackage;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12597e extends AbstractC8914e implements InterfaceC5011e, InterfaceC18318e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f25312e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC5014e f25313e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C3537e f25314e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C16399e f25315e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4930e f25316e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f25317e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C12698e f25318e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final AutofillId f25319e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Rect f25320e = new Rect();

    public C12597e(C12698e c12698e, C3537e c3537e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C4930e c4930e, String str) {
        this.f25318e = c12698e;
        this.f25314e = c3537e;
        this.f25313e = viewTreeObserverOnGlobalLayoutListenerC5014e;
        this.f25316e = c4930e;
        this.f25312e = str;
        viewTreeObserverOnGlobalLayoutListenerC5014e.setImportantForAutofill(1);
        C12698e license = AbstractC0863e.license(viewTreeObserverOnGlobalLayoutListenerC5014e);
        AutofillId autofillId = license != null ? (AutofillId) license.ad : null;
        if (autofillId == null) {
            throw AbstractC8703e.Signature("Required value was null.");
        }
        this.f25319e = autofillId;
        this.f25315e = new C16399e();
    }

    @Override // defpackage.InterfaceC18318e
    public final void ad(C11795e c11795e, C11795e c11795e2) {
        C13915e mopub;
        C0500e inmobi;
        C13915e mopub2;
        C0500e inmobi2;
        if (c11795e != null && (mopub2 = AbstractC5851e.mopub(c11795e)) != null && (inmobi2 = mopub2.inmobi()) != null) {
            C0583e c0583e = inmobi2.f2578e;
            if (c0583e.vip(AbstractC10789e.billing) || c0583e.vip(AbstractC10789e.yandex)) {
                this.f25318e.billing(this.f25313e, mopub2.f27594e);
            }
        }
        if (c11795e2 == null || (mopub = AbstractC5851e.mopub(c11795e2)) == null || (inmobi = mopub.inmobi()) == null) {
            return;
        }
        C0583e c0583e2 = inmobi.f2578e;
        if (c0583e2.vip(AbstractC10789e.billing) || c0583e2.vip(AbstractC10789e.yandex)) {
            int i = mopub.f27594e;
            this.f25316e.vip.m4651return(i, new C8335e(this, i));
        }
    }

    public final void vip(SparseArray sparseArray) {
        C0500e inmobi;
        Function1 function1;
        Function1 function12;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            AutofillValue appmetrica = C0663e.appmetrica(sparseArray.get(keyAt));
            C13915e c13915e = (C13915e) this.f25314e.metrica.vip(keyAt);
            if (c13915e != null && (inmobi = c13915e.inmobi()) != null) {
                C0583e c0583e = inmobi.f2578e;
                Object billing = c0583e.billing(AbstractC10789e.billing);
                if (billing == null) {
                    billing = null;
                }
                C10591e c10591e = (C10591e) billing;
                if (c10591e != null && (function12 = (Function1) c10591e.vip) != null) {
                }
                Object billing2 = c0583e.billing(AbstractC10789e.yandex);
                C10591e c10591e2 = (C10591e) (billing2 != null ? billing2 : null);
                if (c10591e2 != null && (function1 = (Function1) c10591e2.vip) != null) {
                }
            }
        }
    }
}
