package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC5439e extends DialogC6137e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Function0 f11703e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final View f11704e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C16832e f11705e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public long f11706e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C18280e f11707e;

    public DialogC5439e(Function0 function0, C18280e c18280e, long j, View view, EnumC7792e enumC7792e, InterfaceC14388e interfaceC14388e, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f11703e = function0;
        this.f11707e = c18280e;
        this.f11706e = j;
        this.f11704e = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC13467e.metrica(window, false);
        C16832e c16832e = new C16832e(getContext());
        c16832e.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c16832e.setClipChildren(false);
        c16832e.setElevation(interfaceC14388e.mo497instanceof(f));
        c16832e.setOutlineProvider(new C4357e(1));
        this.f11705e = c16832e;
        setContentView(c16832e);
        AbstractC0436e.startapp(c16832e, AbstractC0436e.appmetrica(view));
        AbstractC15143e.billing(c16832e, AbstractC15143e.license(view));
        AbstractC15428e.appmetrica(c16832e, AbstractC15428e.vip(view));
        billing(this.f11703e, this.f11707e, this.f11706e, enumC7792e);
    }

    public final void billing(Function0 function0, C18280e c18280e, long j, EnumC7792e enumC7792e) {
        int i;
        this.f11703e = function0;
        this.f11707e = c18280e;
        this.f11706e = j;
        c18280e.getClass();
        ViewGroup.LayoutParams layoutParams = this.f11704e.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int m2467class = AbstractC8703e.m2467class(1);
        if (m2467class != 0) {
            if (m2467class == 1) {
                z = true;
            } else {
                if (m2467class != 2) {
                    throw new C14803e(10);
                }
                z = false;
            }
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        int ordinal = enumC7792e.ordinal();
        if (ordinal == 0) {
            i = 0;
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            i = 1;
        }
        this.f11705e.setLayoutDirection(i);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
        Window window3 = getWindow();
        C2691e c2691e = new C2691e(getWindow().getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        AbstractC12501e c12643e = i2 >= 35 ? new C12643e(window3, c2691e) : i2 >= 30 ? new C12643e(window3, c2691e) : i2 >= 26 ? new C2309e(window3, c2691e) : new C2309e(window3, c2691e);
        long j2 = C3618e.startapp;
        c12643e.mopub(!C3618e.metrica(j, j2) && ((double) AbstractC6532e.inmobi(j)) <= 0.5d);
        c12643e.adcel(!C3618e.metrica(j, j2) && ((double) AbstractC6532e.inmobi(j)) <= 0.5d);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f11703e.invoke();
        }
        return onTouchEvent;
    }
}
