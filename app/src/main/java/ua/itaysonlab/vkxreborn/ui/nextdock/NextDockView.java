package com.werhes.museeksreborn.ui.nextdock;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.AbstractC15933e;
import defpackage.AbstractC7779e;
import defpackage.AbstractC7890e;
import defpackage.C0998e;
import defpackage.C11980e;
import defpackage.C14182e;
import defpackage.C14648e;
import defpackage.C16616e;
import defpackage.C17706e;
import defpackage.C3685e;
import defpackage.C5363e;
import defpackage.InterfaceC12807e;
import defpackage.RunnableC12719e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import com.werhes.museeks.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002!\"B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\r2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lua/itaysonlab/vkxreborn/ui/nextdock/NextDockView;", "Landroid/widget/LinearLayout;", "Leُّۡ;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lkotlin/Function1;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "listener", BuildConfig.FLAVOR, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Landroid/view/View;", "setOnLongItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "isEnabled", "setLegacyMode", "(Z)V", "Landroid/widget/FrameLayout;", "getCurrentFrameView", "()Landroid/widget/FrameLayout;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "eّٖۦ", "Leؕٛؓ;", "getLayoutInflater", "()Landroid/view/LayoutInflater;", "layoutInflater", "eٖۤۖ", "eِؒؓ", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NextDockView extends LinearLayout implements InterfaceC12807e {

    /* renamed from: eؘَٗ */
    public static final /* synthetic */ int f36758e = 0;

    /* renamed from: eّؑؑ */
    public Function2 f36759e;

    /* renamed from: eًؔؐ */
    public int f36760e;

    /* renamed from: eؘٙؓ */
    public final ArrayList f36761e;

    /* renamed from: eؙِٖ */
    public Function1 f36762e;

    /* renamed from: eّٖۦ */
    public final C5363e f36763e;

    /* renamed from: eٗۚۖ */
    public boolean f36764e;

    public NextDockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36763e = new C5363e(new C14648e(context, 4));
        this.f36761e = new ArrayList();
        this.f36760e = -1;
        this.f36762e = new C3685e(21);
        this.f36759e = new C17706e(1);
    }

    private final LayoutInflater getLayoutInflater() {
        return (LayoutInflater) this.f36763e.getValue();
    }

    public final void ad(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16616e c16616e = (C16616e) it.next();
            ArrayList arrayList2 = this.f36761e;
            int size = arrayList2.size();
            View inflate = getLayoutInflater().inflate(R.layout.v6_nextdock_item, (ViewGroup) this, false);
            int i = R.id.additional_clickZone;
            View vip = AbstractC7779e.vip(inflate, R.id.additional_clickZone);
            if (vip != null) {
                i = R.id.icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) AbstractC7779e.vip(inflate, R.id.icon);
                if (appCompatImageView != null) {
                    i = R.id.selected_frame;
                    FrameLayout frameLayout = (FrameLayout) AbstractC7779e.vip(inflate, R.id.selected_frame);
                    if (frameLayout != null) {
                        FrameLayout frameLayout2 = (FrameLayout) inflate;
                        C11980e c11980e = new C11980e(frameLayout2, vip, appCompatImageView, frameLayout, 20);
                        addView(frameLayout2, size);
                        Unit unit = Unit.INSTANCE;
                        arrayList2.add(size, new C0998e(this, c16616e, c11980e));
                        setWeightSum(arrayList2.size());
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        }
    }

    public final FrameLayout getCurrentFrameView() {
        int i = this.f36760e;
        if (i < 0) {
            i = 0;
        }
        return (FrameLayout) ((C0998e) this.f36761e.get(i)).vip.f23948e;
    }

    @Override // defpackage.InterfaceC12807e
    public final void refreshTheme() {
        Iterator it = this.f36761e.iterator();
        while (it.hasNext()) {
            C0998e c0998e = (C0998e) it.next();
            NextDockView nextDockView = c0998e.metrica;
            int i = 0;
            boolean z = nextDockView.f36761e.indexOf(c0998e) == nextDockView.f36760e;
            int ad = AbstractC15933e.ad(z ? R.attr.global_accent : R.attr.text_secondary);
            if (z) {
                i = AbstractC15933e.ad(R.attr.global_accent);
            }
            c0998e.ad(ad, i);
        }
    }

    public final void setLegacyMode(boolean isEnabled) {
        this.f36764e = isEnabled;
        Iterator it = this.f36761e.iterator();
        while (it.hasNext()) {
            C0998e c0998e = (C0998e) it.next();
            NextDockView nextDockView = c0998e.metrica;
            if (nextDockView.f36760e == nextDockView.f36761e.indexOf(c0998e)) {
                ValueAnimator ofArgb = ValueAnimator.ofArgb(nextDockView.f36764e ? AbstractC15933e.ad(R.attr.global_accent) : 0, nextDockView.f36764e ? 0 : AbstractC15933e.ad(R.attr.global_accent));
                ofArgb.setDuration(350L);
                ofArgb.addUpdateListener(new C14182e(c0998e, 2));
                ofArgb.start();
            }
        }
    }

    public final void setOnItemClickListener(Function1<? super String, Boolean> listener) {
        this.f36762e = listener;
    }

    public final void setOnLongItemClickListener(Function2<? super String, ? super View, Unit> listener) {
        this.f36759e = listener;
    }

    public final void vip(String str, boolean z, boolean z2) {
        Iterator it = this.f36761e.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC7890e.billing(((C0998e) it.next()).ad.ad, str)) {
                break;
            } else {
                i++;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (i == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            post(new RunnableC12719e(valueOf.intValue(), this, z2, z));
        }
    }
}
