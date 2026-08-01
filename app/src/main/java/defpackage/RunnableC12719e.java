package defpackage;

import java.util.ArrayList;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC12719e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25462e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ NextDockView f25463e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f25464e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25465e;

    public /* synthetic */ RunnableC12719e(int i, NextDockView nextDockView, boolean z, boolean z2) {
        this.f25465e = i;
        this.f25463e = nextDockView;
        this.f25462e = z;
        this.f25464e = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        NextDockView nextDockView = this.f25463e;
        ArrayList arrayList = nextDockView.f36761e;
        int size = arrayList.size();
        int i2 = this.f25465e;
        if (i2 > size || i2 < 0) {
            StringBuilder premium = AbstractC4653e.premium("index overflow / idx: ", i2, "; itemSize: ");
            premium.append(arrayList.size());
            AbstractC14966e.ad("NextDock", 5, premium.toString(), null);
        } else if ((!this.f25462e || ((Boolean) nextDockView.f36762e.invoke(((C0998e) arrayList.get(i2)).ad.ad)).booleanValue()) && (i = nextDockView.f36760e) != i2) {
            C0998e c0998e = (C0998e) AbstractC13480e.m3592native(i, arrayList);
            boolean z = this.f25464e;
            if (c0998e != null) {
                c0998e.vip(false, z);
            }
            ((C0998e) arrayList.get(i2)).vip(true, z);
            nextDockView.f36760e = i2;
        }
    }
}
