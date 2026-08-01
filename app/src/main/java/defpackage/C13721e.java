package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؒۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13721e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f27170e = 0;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Object f27171e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Object f27172e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f27173e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ boolean f27174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13721e(Context context, boolean z, InterfaceC18435e interfaceC18435e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27173e = context;
        this.f27174e = z;
        this.f27171e = interfaceC18435e;
        this.f27172e = (AbstractC7185e) function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13721e(C7765e c7765e, InterfaceC13742e interfaceC13742e, boolean z, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27171e = c7765e;
        this.f27172e = interfaceC13742e;
        this.f27174e = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13721e(boolean z, C1718e c1718e, AudioSnippetEntry audioSnippetEntry, C16349e c16349e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f27174e = z;
        this.f27173e = c1718e;
        this.f27171e = audioSnippetEntry;
        this.f27172e = c16349e;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f27170e) {
            case 0:
                return new C13721e((Context) this.f27173e, this.f27174e, (InterfaceC18435e) this.f27171e, (Function2) this.f27172e, interfaceC5083e);
            case 1:
                return new C13721e(this.f27174e, (C1718e) this.f27173e, (AudioSnippetEntry) this.f27171e, (C16349e) this.f27172e, interfaceC5083e);
            default:
                C13721e c13721e = new C13721e((C7765e) this.f27171e, (InterfaceC13742e) this.f27172e, this.f27174e, interfaceC5083e);
                c13721e.f27173e = obj;
                return c13721e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f27170e) {
            case 0:
                return ((C13721e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C13721e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
            default:
                return ((C13721e) advert(interfaceC5083e, interfaceC18435e)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r10v9, types: [eًِٚ, android.app.Dialog] */
    /* JADX WARN: Type inference failed for: r12v1, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v16, types: [eُّؒ] */
    /* JADX WARN: Type inference failed for: r20v1, types: [eٌَٗ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eُّؒ] */
    /* JADX WARN: Type inference failed for: r5v9, types: [eٌّؒ, eٔؐۜ] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.android.material.card.MaterialCardView, android.view.View, java.lang.Object, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r9v8, types: [eٌَٗ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i;
        int i2 = this.f27170e;
        int i3 = 2;
        boolean z = this.f27174e;
        boolean z2 = true;
        Object obj2 = this.f27172e;
        Object obj3 = this.f27171e;
        InterfaceC5083e interfaceC5083e = null;
        switch (i2) {
            case 0:
                AbstractC2003e.purchase(obj);
                Handler handler = new Handler(Looper.getMainLooper());
                int i4 = AbstractC7915e.ad;
                Context context = (Context) this.f27173e;
                ?? materialCardView = new MaterialCardView(context, null);
                materialCardView.setCardBackgroundColor(AbstractC15933e.ad(R.attr.bg_primary));
                materialCardView.setElevation(0.0f);
                materialCardView.setCardElevation(0.0f);
                VKXApplication.Companion companion = VKXApplication.f36531e;
                materialCardView.setRadius(VKXApplication.Companion.ad(8.0f));
                int i5 = AbstractC7915e.ad;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i5, i5);
                layoutParams.gravity = 17;
                materialCardView.setLayoutParams(layoutParams);
                ?? frameLayout = new FrameLayout(context);
                C1607e c1607e = new C1607e(context);
                c1607e.setIndeterminate(true);
                c1607e.setIndicatorSize(AbstractC7915e.metrica);
                c1607e.setIndicatorColor(AbstractC15933e.ad(R.attr.global_accent));
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5);
                layoutParams2.gravity = 17;
                Unit unit = Unit.INSTANCE;
                frameLayout.addView(c1607e, layoutParams2);
                AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                int i6 = AbstractC7915e.vip;
                appCompatImageView.setPadding(i6, i6, i6, i6);
                appCompatImageView.setImageResource(R.drawable.ic_close);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(AbstractC15933e.ad(R.attr.text_secondary)));
                appCompatImageView.setVisibility(8);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i5, i5);
                layoutParams3.gravity = 17;
                frameLayout.addView(appCompatImageView, layoutParams3);
                materialCardView.addView(frameLayout);
                C6571e c6571e = new C6571e(materialCardView, appCompatImageView);
                ?? obj4 = new Object();
                ?? dialogC11829e = new DialogC11829e(context, R.style.TransparentDialog);
                dialogC11829e.setContentView(materialCardView);
                dialogC11829e.setCancelable(false);
                dialogC11829e.setCanceledOnTouchOutside(false);
                int i7 = AbstractC3489e.ad;
                Window window = dialogC11829e.getWindow();
                if (window == null) {
                    throw new IllegalStateException("This shouldn't be possible!");
                }
                AbstractC13467e.metrica(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                if (!z) {
                    appCompatImageView.setOnClickListener(new ViewOnClickListenerC1932e(obj4, handler, dialogC11829e, 0));
                    handler.postDelayed(new RunnableC17584e(5, c6571e), 1500L);
                }
                obj4.f9318e = AbstractC5336e.purchase((InterfaceC18435e) obj3, new C16220e(handler, dialogC11829e, 0), 0, new C3472e((DialogC11829e) dialogC11829e, (InterfaceC5083e) null, (C4246e) obj4, handler, (Function2) obj2), 2);
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                if (z) {
                    C1718e c1718e = (C1718e) this.f27173e;
                    C16330e c16330e = c1718e.f4672e;
                    C16330e c16330e2 = c1718e.f4675e;
                    AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) obj3;
                    AudioTrack audioTrack = (AudioTrack) audioSnippetEntry.billing.get(((C16349e) obj2).loadAd());
                    ListIterator listIterator = c1718e.f4674e.listIterator();
                    int i8 = 0;
                    while (true) {
                        C11045e c11045e = (C11045e) listIterator;
                        i = -1;
                        if (!c11045e.hasNext()) {
                            i8 = -1;
                        } else if (!AbstractC7890e.billing(((AudioSnippetEntry) c11045e.next()).purchase, audioSnippetEntry.purchase)) {
                            i8++;
                        }
                    }
                    Iterator it = audioSnippetEntry.billing.iterator();
                    int i9 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC7890e.billing((AudioTrack) it.next(), audioTrack)) {
                                i = i9;
                            } else {
                                i9++;
                            }
                        }
                    }
                    if (c16330e2.purchase() != i8 || c16330e.purchase() != i) {
                        c16330e2.startapp(i8);
                        c16330e.startapp(i);
                        C3168e c3168e = c1718e.f4664e;
                        VKXApplication vKXApplication = VKXApplication.f36528e;
                        if (vKXApplication == null) {
                            vKXApplication = null;
                        }
                        c3168e.m1250e(vKXApplication.getApplicationContext());
                        ?? m681instanceof = c1718e.m681instanceof();
                        C9466e c9466e = new C9466e();
                        C3560e c3560e = new C3560e();
                        List list = Collections.EMPTY_LIST;
                        C1410e c1410e = C1410e.f4222e;
                        C9457e c9457e = new C9457e();
                        C13325e c13325e = C13325e.license;
                        audioTrack.getClass();
                        String purchase = AbstractC6914e.purchase(audioTrack);
                        purchase.getClass();
                        String str = audioTrack.adcel;
                        Uri parse = str == null ? null : Uri.parse(str);
                        if (((Uri) c3560e.appmetrica) != null && ((UUID) c3560e.license) == null) {
                            z2 = false;
                        }
                        AbstractC2301e.subscription(z2);
                        if (parse != null) {
                            interfaceC5083e = new C16914e(parse, null, ((UUID) c3560e.license) != null ? new C8369e(c3560e) : null, null, list, null, c1410e, null, -9223372036854775807L);
                        }
                        ((Cpackage) m681instanceof).mo2103e(new C1962e(purchase, new C14435e(c9466e), interfaceC5083e, new C15197e(c9457e), C12053e.f24142throw, c13325e));
                        ((C17148e) c1718e.m681instanceof()).license();
                        ((Cpackage) c1718e.m681instanceof()).pro();
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f27173e;
                C7765e c7765e = (C7765e) obj3;
                InterfaceC13742e interfaceC13742e = (InterfaceC13742e) obj2;
                AbstractC5336e.purchase(interfaceC18435e, null, 4, new C1938e(c7765e, interfaceC13742e, interfaceC5083e, 4), 1);
                AbstractC5336e.purchase(interfaceC18435e, null, 4, new C17170e(interfaceC13742e, c7765e, z, (InterfaceC5083e) null), 1).mo692else(new C1017e(c7765e, i3));
                return AbstractC5336e.purchase(interfaceC18435e, null, 4, new C17170e(c7765e, interfaceC13742e, z, (InterfaceC5083e) null), 1);
        }
    }
}
