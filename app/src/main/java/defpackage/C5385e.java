package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5385e extends AbstractC5133e {

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final View f11517e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public String f11518e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public Function0 f11519e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f11520e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final boolean f11521e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public InterfaceC16060e f11522e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final WindowManager.LayoutParams f11523e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C9821e f11524e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final WindowManager f11525e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final int[] f11526e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C12609e f11527e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C0576e f11528e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C15534e f11529e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C13128e f11530e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public C10163e f11531e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public boolean f11532e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public EnumC7792e f11533e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C6656e f11534e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final Rect f11535e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f11536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5385e(Function0 function0, C15534e c15534e, String str, View view, InterfaceC14388e interfaceC14388e, InterfaceC16060e interfaceC16060e, UUID uuid, boolean z) {
        super(view.getContext(), null);
        int i = Build.VERSION.SDK_INT;
        C9821e c9821e = i >= 30 ? new C9821e(6) : i >= 29 ? new C9821e(6) : new C9821e(6);
        this.f11519e = function0;
        this.f11529e = c15534e;
        this.f11518e = str;
        this.f11517e = view;
        this.f11521e = z;
        this.f11524e = c9821e;
        this.f11525e = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C15534e c15534e2 = this.f11529e;
        boolean vip = AbstractC12710e.vip(view);
        boolean z2 = c15534e2.vip;
        int i2 = c15534e2.ad;
        if (z2 && vip) {
            i2 |= 8192;
        } else if (z2 && !vip) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = this.f11529e.purchase;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f11523e = layoutParams;
        this.f11522e = interfaceC16060e;
        this.f11533e = EnumC7792e.f15794e;
        this.f11536e = AbstractC14533e.startapp(null);
        this.f11520e = AbstractC14533e.startapp(null);
        this.f11534e = AbstractC14533e.purchase(new C17073e(13, this));
        this.f11535e = new Rect();
        this.f11530e = new C13128e(new C2155e(this, 2));
        setId(android.R.id.content);
        AbstractC0436e.startapp(this, AbstractC0436e.appmetrica(view));
        AbstractC15143e.billing(this, AbstractC15143e.license(view));
        AbstractC15428e.appmetrica(this, AbstractC15428e.vip(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC14388e.mo497instanceof((float) 8));
        setOutlineProvider(new C4357e(2));
        this.f11528e = AbstractC14533e.startapp(AbstractC10402e.ad);
        this.f11526e = new int[2];
    }

    private final Function2<C13770e, Integer, Unit> getContent() {
        return (Function2) this.f11528e.getValue();
    }

    private final C10163e getDisplayBounds() {
        int i = this.f11529e.ad & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE;
        View view = this.f11517e;
        C9821e c9821e = this.f11524e;
        Rect rect = this.f11535e;
        if (i == 0) {
            c9821e.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            c9821e.yandex(view, rect);
        }
        return new C10163e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0043e getParentLayoutCoordinates() {
        return (InterfaceC0043e) this.f11520e.getValue();
    }

    private final void setContent(Function2<? super C13770e, ? super Integer, Unit> function2) {
        this.f11528e.setValue(function2);
    }

    private final void setParentLayoutCoordinates(InterfaceC0043e interfaceC0043e) {
        this.f11520e.setValue(interfaceC0043e);
    }

    public final void Signature(InterfaceC0043e interfaceC0043e) {
        setParentLayoutCoordinates(interfaceC0043e);
        loadAd();
    }

    @Override // defpackage.AbstractC5133e
    public final void ad(C13770e c13770e, int i) {
        c13770e.m3671package(-857613600);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            getContent().invoke(c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1827e(this, i, 7);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eؚٓٞ, java.lang.Object] */
    public final void admob() {
        C12729e m1893getPopupContentSizebOM6tXw;
        C10163e c10163e = this.f11531e;
        if (c10163e == null || (m1893getPopupContentSizebOM6tXw = m1893getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = m1893getPopupContentSizebOM6tXw.ad;
        C10163e displayBounds = getDisplayBounds();
        long vip = (displayBounds.vip() & 4294967295L) | (displayBounds.license() << 32);
        ?? obj = new Object();
        obj.f14622e = 0L;
        this.f11530e.metrica(this, C8082e.f16424e, new C3807e(obj, this, c10163e, vip, j));
        long j2 = obj.f14622e;
        WindowManager.LayoutParams layoutParams = this.f11523e;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.f11529e.appmetrica;
        C9821e c9821e = this.f11524e;
        if (z) {
            c9821e.startapp(this, (int) (vip >> 32), (int) (vip & 4294967295L));
        }
        c9821e.getClass();
        this.f11525e.updateViewLayout(this, layoutParams);
    }

    public final void amazon(Function0 function0, C15534e c15534e, String str, EnumC7792e enumC7792e) {
        int i;
        this.f11519e = function0;
        this.f11518e = str;
        if (!AbstractC7890e.billing(this.f11529e, c15534e)) {
            c15534e.getClass();
            this.f11529e = c15534e;
            boolean vip = AbstractC12710e.vip(this.f11517e);
            boolean z = c15534e.vip;
            int i2 = c15534e.ad;
            if (z && vip) {
                i2 |= 8192;
            } else if (z && !vip) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f11523e;
            layoutParams.flags = i2;
            this.f11524e.getClass();
            this.f11525e.updateViewLayout(this, layoutParams);
        }
        int ordinal = enumC7792e.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                throw new C14803e(10);
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.AbstractC5133e
    public final void billing(boolean z, int i, int i2, int i3, int i4) {
        super.billing(z, i, i2, i3, i4);
        this.f11529e.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f11523e;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f11524e.getClass();
        this.f11525e.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f11529e.metrica) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                Function0 function0 = this.f11519e;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f11534e.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f11523e;
    }

    public final EnumC7792e getParentLayoutDirection() {
        return this.f11533e;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C12729e m1893getPopupContentSizebOM6tXw() {
        return (C12729e) this.f11536e.getValue();
    }

    public final InterfaceC16060e getPositionProvider() {
        return this.f11522e;
    }

    @Override // defpackage.AbstractC5133e
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f11532e;
    }

    public AbstractC5133e getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f11518e;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void loadAd() {
        InterfaceC0043e parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.billing()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long advert = parentLayoutCoordinates.advert();
            long Signature = this.f11521e ? parentLayoutCoordinates.Signature(0L) : parentLayoutCoordinates.license(0L);
            C10163e vip = AbstractC18366e.vip((Math.round(Float.intBitsToFloat((int) (Signature >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (Signature & 4294967295L)))), advert);
            if (vip.equals(this.f11531e)) {
                return;
            }
            this.f11531e = vip;
            admob();
        }
    }

    @Override // defpackage.AbstractC5133e, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11530e.license();
        if (!this.f11529e.metrica || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f11527e == null) {
            this.f11527e = new C12609e(0, this.f11519e);
        }
        AbstractC14380e.isVip(this, this.f11527e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C13128e c13128e = this.f11530e;
        C2007e c2007e = c13128e.yandex;
        if (c2007e != null) {
            c2007e.vip();
        }
        c13128e.ad();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC14380e.inmobi(this, this.f11527e);
        }
        this.f11527e = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f11529e.license) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f11519e;
            if (function0 != null) {
                function0.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            Function0 function02 = this.f11519e;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(EnumC7792e enumC7792e) {
        this.f11533e = enumC7792e;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1894setPopupContentSizefhxjrPA(C12729e c12729e) {
        this.f11536e.setValue(c12729e);
    }

    public final void setPositionProvider(InterfaceC16060e interfaceC16060e) {
        this.f11522e = interfaceC16060e;
    }

    public final void setTestTag(String str) {
        this.f11518e = str;
    }

    public final void smaato(AbstractC5830e abstractC5830e, Function2 function2) {
        setParentCompositionContext(abstractC5830e);
        setContent(function2);
        this.f11532e = true;
    }

    @Override // defpackage.AbstractC5133e
    public final void yandex(int i, int i2) {
        this.f11529e.getClass();
        C10163e displayBounds = getDisplayBounds();
        super.yandex(View.MeasureSpec.makeMeasureSpec(displayBounds.license(), RecyclerView.UNDEFINED_DURATION), View.MeasureSpec.makeMeasureSpec(displayBounds.vip(), RecyclerView.UNDEFINED_DURATION));
    }
}
