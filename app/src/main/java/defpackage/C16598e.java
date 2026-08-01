package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16598e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5014e f32554e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f32555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16598e(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i) {
        super(0);
        this.f32555e = i;
        this.f32554e = viewTreeObserverOnGlobalLayoutListenerC5014e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int actionMasked;
        int i = this.f32555e;
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this.f32554e;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) viewTreeObserverOnGlobalLayoutListenerC5014e.f10641e.getValue();
                bool.getClass();
                return bool;
            case 1:
                C6473e license = AbstractC18039e.license(viewTreeObserverOnGlobalLayoutListenerC5014e.getConfiguration());
                if (license.ad.isEmpty()) {
                    license = Build.VERSION.SDK_INT >= 24 ? new C6473e(new C4730e(AbstractC12026e.mopub())) : C6473e.ad(Locale.getDefault());
                }
                InterfaceC14706e interfaceC14706e = license.ad;
                int size = interfaceC14706e.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new C0768e(interfaceC14706e.get(i2)));
                }
                return new C4622e(arrayList);
            case 2:
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC5014e.f10616e;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    viewTreeObserverOnGlobalLayoutListenerC5014e.f10611e = SystemClock.uptimeMillis();
                    viewTreeObserverOnGlobalLayoutListenerC5014e.post(viewTreeObserverOnGlobalLayoutListenerC5014e.f10659e);
                }
                return Unit.INSTANCE;
            default:
                viewTreeObserverOnGlobalLayoutListenerC5014e.get_viewTreeOwners();
                return null;
        }
    }
}
