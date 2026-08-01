package defpackage;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.appmetrica;
import androidx.mediarouter.app.billing;
import androidx.mediarouter.app.purchase;
import androidx.recyclerview.widget.loadAd;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC8021e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f16304e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16305e;

    public /* synthetic */ ViewOnClickListenerC8021e(int i, Object obj) {
        this.f16305e = i;
        this.f16304e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int max;
        switch (this.f16305e) {
            case 0:
                ((AbstractC12364e) this.f16304e).vip();
                return;
            case 1:
                C3024e c3024e = (C3024e) this.f16304e;
                Message obtain = (view != c3024e.startapp || (message3 = c3024e.mopub) == null) ? (view != c3024e.advert || (message2 = c3024e.amazon) == null) ? (view != c3024e.loadAd || (message = c3024e.admob) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c3024e.firebase.obtainMessage(1, c3024e.vip).sendToTarget();
                return;
            case 2:
                C1421e c1421e = (C1421e) this.f16304e;
                int i = c1421e.f4253e;
                if (i == 2) {
                    c1421e.m604this(1);
                    return;
                } else {
                    if (i == 1) {
                        c1421e.m604this(2);
                        return;
                    }
                    return;
                }
            case 3:
                ((DialogC6738e) this.f16304e).dismiss();
                return;
            case 4:
                appmetrica appmetricaVar = (appmetrica) this.f16304e;
                DialogC1747e dialogC1747e = appmetricaVar.inmobi;
                if (dialogC1747e.f4781e != null) {
                    dialogC1747e.f4775e.removeMessages(2);
                }
                dialogC1747e.f4781e = appmetricaVar.signatures;
                boolean isActivated = view.isActivated();
                boolean z = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) dialogC1747e.f4770e.get(appmetricaVar.signatures.metrica);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                appmetricaVar.pro(z);
                appmetricaVar.isVip.setProgress(max);
                appmetricaVar.signatures.adcel(max);
                dialogC1747e.f4775e.sendEmptyMessageDelayed(2, 500L);
                return;
            case 5:
                C9224e c9224e = (C9224e) this.f16304e;
                C10085e c10085e = c9224e.ads.f8213e.f4786e;
                C6541e c6541e = c9224e.applovin;
                c10085e.getClass();
                if (c6541e == null) {
                    throw new NullPointerException("route must not be null");
                }
                C10085e.vip();
                C14090e metrica = C10085e.metrica();
                C14756e ad = metrica.license.ad();
                if (ad == null) {
                    Log.w("AxMediaRouter", "Ignoring attempt to transfer for a selected non-group route");
                } else {
                    List<C6541e> singletonList = Collections.singletonList(c6541e);
                    ArrayList arrayList = new ArrayList();
                    for (C6541e c6541e2 : singletonList) {
                        C7712e c7712e = (C7712e) ad.inmobi.get(c6541e2.metrica);
                        if (c7712e == null || !c7712e.appmetrica) {
                            Log.w("AxMediaRouter", "Ignoring attempt to update the group with a non-transferable route: " + c6541e2);
                        } else {
                            arrayList.add(c6541e2.vip);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        Log.w("AxMediaRouter", "Ignoring attempt to update the group with non-transferable routes");
                    } else if (ad.billing()) {
                        AbstractC13922e abstractC13922e = metrica.appmetrica;
                        if (!(abstractC13922e instanceof AbstractC16709e)) {
                            throw new IllegalStateException("There is no currently selected dynamic group route.");
                        }
                        ((AbstractC16709e) abstractC13922e).loadAd(arrayList);
                    } else if (ad.amazon()) {
                        metrica.purchase();
                        Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + ad);
                    } else {
                        Log.w("AxMediaRouter", "Ignoring attempt to update routes for an unsupported group route:" + ad);
                    }
                }
                c9224e.tapsense.setVisibility(4);
                c9224e.isVip.setVisibility(0);
                return;
            case 6:
                billing billingVar = (billing) this.f16304e;
                C3654e c3654e = billingVar.f471goto;
                boolean signatures = billingVar.signatures(billingVar.signatures);
                boolean z2 = !signatures;
                boolean appmetrica = billingVar.signatures.appmetrica();
                if (signatures) {
                    C10085e c10085e2 = c3654e.f8213e.f4786e;
                    C6541e c6541e3 = billingVar.signatures;
                    c10085e2.getClass();
                    if (c6541e3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    C10085e.vip();
                    C14090e metrica2 = C10085e.metrica();
                    C14756e ad2 = metrica2.license.ad();
                    if (ad2 == null) {
                        Log.w("AxMediaRouter", "Ignoring attempt to remove a member route from a selected non-group route");
                    } else {
                        C7712e c7712e2 = (C7712e) ad2.inmobi.get(c6541e3.metrica);
                        if (c7712e2 == null || !c7712e2.metrica) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a non-unselectable member route: " + c6541e3);
                        } else if (!DesugarCollections.unmodifiableList(ad2.tapsense).contains(c6541e3)) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a non-in-group member route: " + c6541e3);
                        } else if (DesugarCollections.unmodifiableList(ad2.tapsense).size() <= 1) {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove the last member route.");
                        } else if (ad2.billing()) {
                            AbstractC13922e abstractC13922e2 = metrica2.appmetrica;
                            if (!(abstractC13922e2 instanceof AbstractC16709e)) {
                                throw new IllegalStateException("There is no currently selected dynamic group route.");
                            }
                            ((AbstractC16709e) abstractC13922e2).amazon(c6541e3.vip);
                        } else if (ad2.amazon()) {
                            metrica2.purchase();
                            Log.w("AxMediaRouter", "Ignoring attempt to update routes for a non-available connected route: " + ad2);
                        } else {
                            Log.w("AxMediaRouter", "Ignoring attempt to remove a route from an unsupported group route:" + ad2);
                        }
                    }
                } else {
                    C10085e c10085e3 = c3654e.f8213e.f4786e;
                    C6541e c6541e4 = billingVar.signatures;
                    c10085e3.getClass();
                    if (c6541e4 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    C10085e.vip();
                    C14090e metrica3 = C10085e.metrica();
                    C14756e ad3 = metrica3.license.ad();
                    if (ad3 == null) {
                        Log.w("AxMediaRouter", "Ignoring attempt to add a member route to a selected non-group route");
                    } else if (!ad3.loadAd(c6541e4)) {
                        Log.w("AxMediaRouter", "Ignoring attempt to add a non-groupable member route: " + c6541e4);
                    } else if (DesugarCollections.unmodifiableList(ad3.tapsense).contains(c6541e4)) {
                        Log.w("AxMediaRouter", "Ignoring attempt to add an existing member route: " + c6541e4);
                    } else if (ad3.billing()) {
                        AbstractC13922e abstractC13922e3 = metrica3.appmetrica;
                        if (!(abstractC13922e3 instanceof AbstractC16709e)) {
                            throw new IllegalStateException("There is no currently selected dynamic group route.");
                        }
                        ((AbstractC16709e) abstractC13922e3).smaato(c6541e4.vip);
                    } else if (ad3.amazon()) {
                        metrica3.purchase();
                        Log.w("AxMediaRouter", "Ignoring attempt to add a route to a non-available connected route: " + ad3);
                    } else {
                        Log.w("AxMediaRouter", "Ignoring attempt to add a route to an unsupported group route:" + ad3);
                    }
                }
                billingVar.tapsense(z2, !appmetrica);
                if (appmetrica) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(c3654e.f8213e.f4752e.tapsense);
                    for (C6541e c6541e5 : DesugarCollections.unmodifiableList(billingVar.signatures.tapsense)) {
                        if (unmodifiableList.contains(c6541e5) != z2) {
                            appmetrica appmetricaVar2 = (appmetrica) c3654e.f8213e.f4778e.get(c6541e5.metrica);
                            if (appmetricaVar2 instanceof billing) {
                                ((billing) appmetricaVar2).tapsense(z2, true);
                            }
                        }
                    }
                }
                DialogC1747e dialogC1747e2 = c3654e.f8213e;
                C6541e c6541e6 = billingVar.signatures;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(dialogC1747e2.f4752e.tapsense);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (c6541e6.appmetrica()) {
                    Iterator it = DesugarCollections.unmodifiableList(c6541e6.tapsense).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((C6541e) it.next()) != z2) {
                            max2 += !signatures ? 1 : -1;
                        }
                    }
                } else {
                    max2 += signatures ? -1 : 1;
                }
                boolean z3 = dialogC1747e2.f4788e && DesugarCollections.unmodifiableList(dialogC1747e2.f4752e.tapsense).size() > 1;
                boolean z4 = dialogC1747e2.f4788e && max2 >= 2;
                if (z3 != z4) {
                    loadAd findViewHolderForAdapterPosition = dialogC1747e2.f4787e.findViewHolderForAdapterPosition(0);
                    if (findViewHolderForAdapterPosition instanceof purchase) {
                        purchase purchaseVar = (purchase) findViewHolderForAdapterPosition;
                        c3654e.ads(purchaseVar.ad, z4 ? purchaseVar.applovin : 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                C3212e c3212e = ((Toolbar) this.f16304e).f266e;
                C9995e c9995e = c3212e == null ? null : c3212e.f7331e;
                if (c9995e != null) {
                    c9995e.collapseActionView();
                    return;
                }
                return;
        }
    }
}
