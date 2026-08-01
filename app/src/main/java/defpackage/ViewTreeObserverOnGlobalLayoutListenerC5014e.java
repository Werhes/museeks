package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC5014e extends ViewGroup implements InterfaceC16590e, InterfaceC8941e, InterfaceC10010e, InterfaceC13619e, InterfaceC12757e, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, InterfaceC18318e {

    /* renamed from: eؗۗؓ, reason: contains not printable characters */
    public static Class f10603e;

    /* renamed from: eؗۢؗ, reason: contains not printable characters */
    public static RunnableC5512e f10604e;

    /* renamed from: eٌۜۧ, reason: contains not printable characters */
    public static Method f10605e;

    /* renamed from: eِؔۛ, reason: contains not printable characters */
    public static final C12328e f10606e = new C12328e();

    /* renamed from: eٓۦْ, reason: contains not printable characters */
    public static Method f10607e;

    /* renamed from: e۠ۢ, reason: contains not printable characters */
    public static Method f10608e;

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public boolean f10609e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C4017e f10610e;

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public long f10611e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final C0324e f10612e;

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public final C0514e f10613e;

    /* renamed from: eٕؒٓ, reason: contains not printable characters */
    public final InterfaceC3582e f10614e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C8212e f10615e;

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public MotionEvent f10616e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final View f10617e;

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public final C0381e f10618e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f10619e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final RunnableC7305e f10620e;

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public final C3168e f10621e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final RunnableC7521e f10622e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public InterfaceC8850e f10623e;

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public final InterfaceC14165e f10624e;

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public long f10625e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public final C0576e f10626e;

    /* renamed from: eؕۚٙ, reason: contains not printable characters */
    public final C2313e f10627e;

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public final C0576e f10628e;

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public final C18188e f10629e;

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public final C6656e f10630e;

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public C3112e f10631e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C6656e f10632e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final C12597e f10633e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public boolean f10634e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public C12328e f10635e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final C6086e f10636e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C12201e f10637e;

    /* renamed from: eٍؘٖ, reason: contains not printable characters */
    public final C16598e f10638e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public long f10639e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final C16615e f10640e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C0576e f10641e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final ViewOnDragListenerC18365e f10642e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public final C9351e f10643e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C1692e f10644e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public boolean f10645e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public boolean f10646e;

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public C13094e f10647e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public final C4446e f10648e;

    /* renamed from: eً۟ۘ, reason: contains not printable characters */
    public boolean f10649e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public InterfaceC8493e f10650e;

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public final InterfaceC3314e f10651e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC2004e f10652e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public ViewOnAttachStateChangeListenerC5346e f10653e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public long f10654e;

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public float f10655e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C0576e f10656e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C3537e f10657e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C13915e f10658e;

    /* renamed from: eَۡٙ, reason: contains not printable characters */
    public final RunnableC12991e f10659e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public final C12328e f10660e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f10661e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public final C8127e f10662e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C16125e f10663e;

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public final InterfaceC5178e f10664e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public boolean f10665e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C7180e f10666e;

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public final C12328e f10667e;

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public C7452e f10668e;

    /* renamed from: eِۜۙ, reason: contains not printable characters */
    public boolean f10669e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public C5602e f10670e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final C15087e f10671e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public final float[] f10672e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public final float[] f10673e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C3123e f10674e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C12718e f10675e;

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public Function1 f10676e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public boolean f10677e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C4930e f10678e;

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public final C5409e f10679e;

    /* renamed from: eٓۗٞ, reason: contains not printable characters */
    public final C7407e f10680e;

    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    public final RunnableC7305e f10681e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public final float[] f10682e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final C12344e f10683e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public long f10684e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final C2842e f10685e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0576e f10686e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final C6656e f10687e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public final C0576e f10688e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public C16965e f10689e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public InterfaceC14745e f10690e;

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public final AtomicReference f10691e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C14939e f10692e;

    /* renamed from: e٘ؔؖ, reason: contains not printable characters */
    public View f10693e;

    /* renamed from: eِ٘, reason: contains not printable characters */
    public float f10694e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public C13213e f10695e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final int[] f10696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, eؘؔ۠] */
    /* JADX WARN: Type inference failed for: r1v34, types: [eؘؑۘ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [eٍؓؖ, eْۤۡ] */
    public ViewTreeObserverOnGlobalLayoutListenerC5014e(Context context, C14843e c14843e) {
        super(context);
        C12597e c12597e;
        ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = this;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10686e = AbstractC14533e.startapp(c14843e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10639e = 9205357640488583168L;
        int i = 1;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10619e = true;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10610e = c14843e.subscription;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10650e = C17354e.f34036e;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10675e = new C12718e();
        int i2 = 0;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10620e = new RunnableC7305e(viewTreeObserverOnGlobalLayoutListenerC5014e, i2);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10656e = new C0576e(AbstractC12315e.ad(context), C10990e.f21769e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10615e = new C8212e(viewTreeObserverOnGlobalLayoutListenerC5014e, viewTreeObserverOnGlobalLayoutListenerC5014e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10623e = c14843e.vip.adcel();
        int i3 = 0;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10642e = new ViewOnDragListenerC18365e(new C9335e(3, viewTreeObserverOnGlobalLayoutListenerC5014e, ViewTreeObserverOnGlobalLayoutListenerC5014e.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0, i3, 0));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10644e = new C1692e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10641e = AbstractC14533e.startapp(Boolean.FALSE);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10632e = AbstractC14533e.purchase(new C16598e(viewTreeObserverOnGlobalLayoutListenerC5014e, i2));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10663e = c14843e.pro;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10692e = c14843e.admob;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10622e = new RunnableC7521e();
        int i4 = 3;
        C13915e c13915e = new C13915e(3);
        c13915e.m3719return(C7992e.metrica);
        c13915e.m3713instanceof(viewTreeObserverOnGlobalLayoutListenerC5014e.getDensity());
        c13915e.m3721switch(viewTreeObserverOnGlobalLayoutListenerC5014e.getViewConfiguration());
        c13915e.m3707else(AbstractC5087e.isVip(new C11518e(viewTreeObserverOnGlobalLayoutListenerC5014e), ((C8212e) viewTreeObserverOnGlobalLayoutListenerC5014e.getFocusOwner()).appmetrica).premium(viewTreeObserverOnGlobalLayoutListenerC5014e.getDragAndDropManager().metrica));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10658e = c13915e;
        C3123e c3123e = AbstractC12146e.ad;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10674e = new C3123e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.m1714getLayoutNodes();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10678e = new C4930e(viewTreeObserverOnGlobalLayoutListenerC5014e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10657e = new C3537e(viewTreeObserverOnGlobalLayoutListenerC5014e.getRoot(), new AbstractC13616e(), viewTreeObserverOnGlobalLayoutListenerC5014e.m1714getLayoutNodes());
        ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = new ViewOnAttachStateChangeListenerC2004e(viewTreeObserverOnGlobalLayoutListenerC5014e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10652e = viewOnAttachStateChangeListenerC2004e;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10653e = new ViewOnAttachStateChangeListenerC5346e(viewTreeObserverOnGlobalLayoutListenerC5014e, new Cvolatile(0, viewTreeObserverOnGlobalLayoutListenerC5014e, C7582e.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, i3, 21));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10662e = c14843e.adcel;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10648e = new C4446e(viewTreeObserverOnGlobalLayoutListenerC5014e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10637e = new C12201e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10660e = new C12328e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10643e = new C9351e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10683e = new C12344e(viewTreeObserverOnGlobalLayoutListenerC5014e.getRoot());
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10688e = AbstractC14533e.startapp(new Configuration(context.getResources().getConfiguration()));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10687e = AbstractC14533e.purchase(new C16598e(viewTreeObserverOnGlobalLayoutListenerC5014e, i));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10612e = appmetrica() ? new C0324e(viewTreeObserverOnGlobalLayoutListenerC5014e, viewTreeObserverOnGlobalLayoutListenerC5014e.getAutofillTree()) : null;
        if (appmetrica()) {
            AutofillManager appmetrica = C12885e.appmetrica(context.getSystemService(C12885e.startapp()));
            if (appmetrica == null) {
                throw AbstractC8703e.Signature("Autofill service could not be located.");
            }
            viewTreeObserverOnGlobalLayoutListenerC5014e = this;
            c12597e = new C12597e(new C12698e(appmetrica), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        } else {
            c12597e = null;
        }
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10633e = c12597e;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10640e = c14843e.advert;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10685e = c14843e.smaato;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10671e = new C15087e(new C3049e(viewTreeObserverOnGlobalLayoutListenerC5014e, i));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10636e = new C6086e(viewTreeObserverOnGlobalLayoutListenerC5014e.getRoot());
        long j = Alert.DURATION_SHOW_INDEFINITELY;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10684e = (j & 4294967295L) | (j << 32);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10696e = new int[]{0, 0};
        float[] ad = C6739e.ad();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10682e = ad;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10673e = C6739e.ad();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10672e = C6739e.ad();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10654e = -1L;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10625e = 9187343241974906880L;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10626e = AbstractC14533e.startapp(null);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10630e = AbstractC14533e.purchase(new C16598e(viewTreeObserverOnGlobalLayoutListenerC5014e, i4));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10691e = new AtomicReference(null);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10624e = c14843e.amazon;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10651e = c14843e.loadAd;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = AbstractC12410e.ad;
        EnumC7792e enumC7792e = EnumC7792e.f15794e;
        EnumC7792e enumC7792e2 = layoutDirection != 0 ? layoutDirection != 1 ? null : EnumC7792e.f15793e : enumC7792e;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10628e = AbstractC14533e.startapp(enumC7792e2 != null ? enumC7792e2 : enumC7792e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10664e = c14843e.Signature;
        int i5 = 2;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10629e = new C18188e(viewTreeObserverOnGlobalLayoutListenerC5014e.isInTouchMode() ? 1 : 2);
        ?? obj = new Object();
        new C12431e(0, new C5552e[16]);
        new C12431e(0, new C15816e[16]);
        new C12431e(0, new C13915e[16]);
        new C12431e(0, new C15816e[16]);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10679e = obj;
        ?? obj2 = new Object();
        new C17073e(i, obj2);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10613e = obj2;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10621e = new C3168e(25);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10667e = new C12328e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10659e = new RunnableC12991e(i2, viewTreeObserverOnGlobalLayoutListenerC5014e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10681e = new RunnableC7305e(viewTreeObserverOnGlobalLayoutListenerC5014e, i);
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10618e = new C0381e(context, new C3049e(viewTreeObserverOnGlobalLayoutListenerC5014e, i2));
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10638e = new C16598e(viewTreeObserverOnGlobalLayoutListenerC5014e, i5);
        int i6 = Build.VERSION.SDK_INT;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10614e = i6 < 29 ? new C16911e(ad) : new C6319e();
        viewTreeObserverOnGlobalLayoutListenerC5014e.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC5014e.f10653e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.setWillNotDraw(false);
        viewTreeObserverOnGlobalLayoutListenerC5014e.setFocusable(true);
        if (i6 >= 26) {
            C15953e.ad.ad(viewTreeObserverOnGlobalLayoutListenerC5014e, 1, false);
        }
        viewTreeObserverOnGlobalLayoutListenerC5014e.setFocusableInTouchMode(true);
        viewTreeObserverOnGlobalLayoutListenerC5014e.setClipChildren(false);
        AbstractC2016e.loadAd(viewTreeObserverOnGlobalLayoutListenerC5014e, viewOnAttachStateChangeListenerC2004e);
        viewTreeObserverOnGlobalLayoutListenerC5014e.setOnDragListener(viewTreeObserverOnGlobalLayoutListenerC5014e.getDragAndDropManager());
        viewTreeObserverOnGlobalLayoutListenerC5014e.getRoot().license(viewTreeObserverOnGlobalLayoutListenerC5014e);
        if (i6 >= 29) {
            C1565e.ad.ad(viewTreeObserverOnGlobalLayoutListenerC5014e);
        }
        if (loadAd()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            viewTreeObserverOnGlobalLayoutListenerC5014e.f10617e = view;
            viewTreeObserverOnGlobalLayoutListenerC5014e.addView(view, -1);
        }
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10680e = i6 >= 31 ? new C7407e(3) : null;
        viewTreeObserverOnGlobalLayoutListenerC5014e.f10627e = new C2313e(viewTreeObserverOnGlobalLayoutListenerC5014e);
    }

    public static View adcel(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC7890e.billing(declaredMethod.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View adcel = adcel(viewGroup.getChildAt(i2), i);
                    if (adcel != null) {
                        return adcel;
                    }
                }
            }
        }
        return null;
    }

    public static boolean admob(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Alert.DURATION_SHOW_INDEFINITELY) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !C0240e.ad.ad(motionEvent, i));
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    public static boolean appmetrica() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static void billing(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5014e) {
                ((ViewTreeObserverOnGlobalLayoutListenerC5014e) childAt).applovin();
            } else if (childAt instanceof ViewGroup) {
                billing((ViewGroup) childAt);
            }
        }
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f10632e.getValue()).booleanValue();
    }

    @InterfaceC10293e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final C13094e getLegacyTextInputServiceAndroid() {
        C13094e c13094e = this.f10647e;
        if (c13094e != null) {
            return c13094e;
        }
        C13094e c13094e2 = new C13094e(getView(), this);
        this.f10647e = c13094e2;
        return c13094e2;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m1697getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC10293e
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    private final C14843e get_composeViewContext() {
        return (C14843e) this.f10686e.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4728e get_viewTreeOwners() {
        AbstractC1786e.applovin(this.f10626e.getValue());
        return null;
    }

    public static boolean loadAd() {
        return Build.VERSION.SDK_INT >= 35;
    }

    private final void setAttached(boolean z) {
        this.f10641e.setValue(Boolean.valueOf(z));
    }

    private void setDensity(InterfaceC14388e interfaceC14388e) {
        this.f10656e.setValue(interfaceC14388e);
    }

    private void setFontFamilyResolver(InterfaceC2141e interfaceC2141e) {
        this.f10651e.setValue(interfaceC2141e);
    }

    private void setLayoutDirection(EnumC7792e enumC7792e) {
        this.f10628e.setValue(enumC7792e);
    }

    private final void set_composeViewContext(C14843e c14843e) {
        this.f10686e.setValue(c14843e);
    }

    private final void set_viewTreeOwners(AbstractC4728e abstractC4728e) {
        this.f10626e.setValue(abstractC4728e);
    }

    public static void smaato(C13915e c13915e) {
        c13915e.m3705class();
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            smaato((C13915e) objArr[i2]);
        }
    }

    public static final void vip(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int license;
        ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = viewTreeObserverOnGlobalLayoutListenerC5014e.f10652e;
        if (AbstractC7890e.billing(str, viewOnAttachStateChangeListenerC2004e.f5219e)) {
            int license2 = viewOnAttachStateChangeListenerC2004e.f5233e.license(i, -1);
            if (license2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, license2);
                return;
            }
            return;
        }
        if (!AbstractC7890e.billing(str, viewOnAttachStateChangeListenerC2004e.f5231e) || (license = viewOnAttachStateChangeListenerC2004e.f5224e.license(i, -1)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, license);
    }

    public static long yandex(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j = size;
        return j | (j << 32);
    }

    @Override // defpackage.InterfaceC18318e
    public final void ad(C11795e c11795e, C11795e c11795e2) {
        C14742e c14742e;
        boolean z;
        C14742e c14742e2;
        boolean z2;
        if (c11795e != null) {
            C11795e c11795e3 = c11795e;
            if (!c11795e3.f27022e.f27016e) {
                AbstractC14070e.metrica("visitAncestors called on an unattached node");
            }
            AbstractC13616e abstractC13616e = c11795e3.f27022e;
            C13915e mopub = AbstractC5851e.mopub(c11795e);
            C12618e c12618e = null;
            ArrayList arrayList = null;
            while (mopub != null) {
                if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 2097152) != 0) {
                    while (abstractC13616e != null) {
                        if ((abstractC13616e.f27014e & 2097152) != 0) {
                            AbstractC13616e abstractC13616e2 = abstractC13616e;
                            C12431e c12431e = null;
                            while (abstractC13616e2 != null) {
                                if (abstractC13616e2 instanceof InterfaceC1946e) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC13616e2);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (abstractC13616e2.f27014e & 2097152) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                                    int i = 0;
                                    for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                        if ((abstractC13616e3.f27014e & 2097152) != 0) {
                                            i++;
                                            if (i == 1) {
                                                abstractC13616e2 = abstractC13616e3;
                                            } else {
                                                if (c12431e == null) {
                                                    c12431e = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC13616e2 != null) {
                                                    c12431e.license(abstractC13616e2);
                                                    abstractC13616e2 = null;
                                                }
                                                c12431e.license(abstractC13616e3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                abstractC13616e2 = AbstractC5851e.vip(c12431e);
                            }
                        }
                        abstractC13616e = abstractC13616e.f27011e;
                    }
                }
                mopub = mopub.tapsense();
                abstractC13616e = (mopub == null || (c14742e2 = mopub.f27592e) == null) ? null : (C9011e) c14742e2.purchase;
            }
            if (arrayList == null) {
                return;
            }
            if (c11795e2 != null) {
                if (!c11795e2.f27022e.f27016e) {
                    AbstractC14070e.metrica("visitAncestors called on an unattached node");
                }
                AbstractC13616e abstractC13616e4 = c11795e2.f27022e;
                C13915e mopub2 = AbstractC5851e.mopub(c11795e2);
                C12618e c12618e2 = null;
                while (mopub2 != null) {
                    if ((((AbstractC13616e) mopub2.f27592e.billing).f27020e & 2097152) != 0) {
                        while (abstractC13616e4 != null) {
                            if ((abstractC13616e4.f27014e & 2097152) != 0) {
                                AbstractC13616e abstractC13616e5 = abstractC13616e4;
                                C12431e c12431e2 = null;
                                while (abstractC13616e5 != null) {
                                    if (abstractC13616e5 instanceof InterfaceC1946e) {
                                        if (c12618e2 == null) {
                                            C12618e c12618e3 = AbstractC1710e.ad;
                                            c12618e2 = new C12618e();
                                        }
                                        c12618e2.ad(abstractC13616e5);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (abstractC13616e5.f27014e & 2097152) != 0 && (abstractC13616e5 instanceof AbstractC6126e)) {
                                        int i2 = 0;
                                        for (AbstractC13616e abstractC13616e6 = ((AbstractC6126e) abstractC13616e5).f12873e; abstractC13616e6 != null; abstractC13616e6 = abstractC13616e6.f27024e) {
                                            if ((abstractC13616e6.f27014e & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    abstractC13616e5 = abstractC13616e6;
                                                } else {
                                                    if (c12431e2 == null) {
                                                        c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                                    }
                                                    if (abstractC13616e5 != null) {
                                                        c12431e2.license(abstractC13616e5);
                                                        abstractC13616e5 = null;
                                                    }
                                                    c12431e2.license(abstractC13616e6);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    abstractC13616e5 = AbstractC5851e.vip(c12431e2);
                                }
                            }
                            abstractC13616e4 = abstractC13616e4.f27011e;
                        }
                    }
                    mopub2 = mopub2.tapsense();
                    abstractC13616e4 = (mopub2 == null || (c14742e = mopub2.f27592e) == null) ? null : (C9011e) c14742e.purchase;
                }
                c12618e = c12618e2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC1946e interfaceC1946e = (InterfaceC1946e) arrayList.get(i3);
                if (!(c12618e != null ? c12618e.metrica(interfaceC1946e) : false)) {
                    interfaceC1946e.mo733switch();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C11795e c11795e = ((C8212e) getFocusOwner()).metrica;
        if (!c11795e.f27016e) {
            return;
        }
        if (!c11795e.f27022e.f27016e) {
            AbstractC14070e.metrica("visitSubtreeIf called on an unattached node");
        }
        C12431e c12431e = new C12431e(0, new AbstractC13616e[16]);
        AbstractC13616e abstractC13616e = c11795e.f27022e;
        AbstractC13616e abstractC13616e2 = abstractC13616e.f27024e;
        if (abstractC13616e2 == null) {
            AbstractC5851e.ad(c12431e, abstractC13616e);
        } else {
            c12431e.license(abstractC13616e2);
        }
        while (true) {
            int i3 = c12431e.f24868e;
            if (i3 == 0) {
                return;
            }
            AbstractC13616e abstractC13616e3 = (AbstractC13616e) c12431e.amazon(i3 - 1);
            if ((abstractC13616e3.f27020e & 1024) != 0) {
                for (AbstractC13616e abstractC13616e4 = abstractC13616e3; abstractC13616e4 != null && abstractC13616e4.f27016e; abstractC13616e4 = abstractC13616e4.f27024e) {
                    if ((abstractC13616e4.f27014e & 1024) != 0) {
                        AbstractC13616e abstractC13616e5 = abstractC13616e4;
                        C12431e c12431e2 = null;
                        while (abstractC13616e5 != null) {
                            if (abstractC13616e5 instanceof C11795e) {
                                C11795e c11795e2 = (C11795e) abstractC13616e5;
                                if (c11795e2.f27016e && c11795e2.m3238e().ad) {
                                    super.addFocusables(arrayList, i, i2);
                                    C11795e c11795e3 = ((C8212e) getFocusOwner()).metrica;
                                    if (c11795e3.f27016e) {
                                        if (!c11795e3.f27022e.f27016e) {
                                            AbstractC14070e.metrica("visitSubtreeIf called on an unattached node");
                                        }
                                        C12431e c12431e3 = new C12431e(0, new AbstractC13616e[16]);
                                        AbstractC13616e abstractC13616e6 = c11795e3.f27022e;
                                        AbstractC13616e abstractC13616e7 = abstractC13616e6.f27024e;
                                        if (abstractC13616e7 == null) {
                                            AbstractC5851e.ad(c12431e3, abstractC13616e6);
                                        } else {
                                            c12431e3.license(abstractC13616e7);
                                        }
                                        while (true) {
                                            int i4 = c12431e3.f24868e;
                                            if (i4 == 0) {
                                                break;
                                            }
                                            AbstractC13616e abstractC13616e8 = (AbstractC13616e) c12431e3.amazon(i4 - 1);
                                            if ((abstractC13616e8.f27020e & 1024) != 0) {
                                                for (AbstractC13616e abstractC13616e9 = abstractC13616e8; abstractC13616e9 != null && abstractC13616e9.f27016e; abstractC13616e9 = abstractC13616e9.f27024e) {
                                                    if ((abstractC13616e9.f27014e & 1024) != 0) {
                                                        AbstractC13616e abstractC13616e10 = abstractC13616e9;
                                                        C12431e c12431e4 = null;
                                                        while (abstractC13616e10 != null) {
                                                            if (abstractC13616e10 instanceof C11795e) {
                                                                C11795e c11795e4 = (C11795e) abstractC13616e10;
                                                                if (c11795e4.f27016e) {
                                                                    C16061e m3238e = c11795e4.m3238e();
                                                                    if (c11795e4.f27016e && !c11795e4.f23671e && m3238e.ad) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC13616e10.f27014e & 1024) != 0 && (abstractC13616e10 instanceof AbstractC6126e)) {
                                                                int i5 = 0;
                                                                for (AbstractC13616e abstractC13616e11 = ((AbstractC6126e) abstractC13616e10).f12873e; abstractC13616e11 != null; abstractC13616e11 = abstractC13616e11.f27024e) {
                                                                    if ((abstractC13616e11.f27014e & 1024) != 0) {
                                                                        i5++;
                                                                        if (i5 == 1) {
                                                                            abstractC13616e10 = abstractC13616e11;
                                                                        } else {
                                                                            if (c12431e4 == null) {
                                                                                c12431e4 = new C12431e(0, new AbstractC13616e[16]);
                                                                            }
                                                                            if (abstractC13616e10 != null) {
                                                                                c12431e4.license(abstractC13616e10);
                                                                                abstractC13616e10 = null;
                                                                            }
                                                                            c12431e4.license(abstractC13616e11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i5 == 1) {
                                                                }
                                                            }
                                                            abstractC13616e10 = AbstractC5851e.vip(c12431e4);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC5851e.ad(c12431e3, abstractC13616e8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC13616e5.f27014e & 1024) != 0 && (abstractC13616e5 instanceof AbstractC6126e)) {
                                int i6 = 0;
                                for (AbstractC13616e abstractC13616e12 = ((AbstractC6126e) abstractC13616e5).f12873e; abstractC13616e12 != null; abstractC13616e12 = abstractC13616e12.f27024e) {
                                    if ((abstractC13616e12.f27014e & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            abstractC13616e5 = abstractC13616e12;
                                        } else {
                                            if (c12431e2 == null) {
                                                c12431e2 = new C12431e(0, new AbstractC13616e[16]);
                                            }
                                            if (abstractC13616e5 != null) {
                                                c12431e2.license(abstractC13616e5);
                                                abstractC13616e5 = null;
                                            }
                                            c12431e2.license(abstractC13616e12);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            abstractC13616e5 = AbstractC5851e.vip(c12431e2);
                        }
                    }
                }
            }
            AbstractC5851e.ad(c12431e, abstractC13616e3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i;
        generateDefaultLayoutParams.height = i2;
        Unit unit = Unit.INSTANCE;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    public final void ads(C13915e c13915e) {
        ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = this.f10652e;
        viewOnAttachStateChangeListenerC2004e.f5239e = true;
        if (viewOnAttachStateChangeListenerC2004e.tapsense()) {
            viewOnAttachStateChangeListenerC2004e.isVip(c13915e);
        }
        ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e = this.f10653e;
        viewOnAttachStateChangeListenerC5346e.f11469e = true;
        if (viewOnAttachStateChangeListenerC5346e.license()) {
            viewOnAttachStateChangeListenerC5346e.f11464e.amazon(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0128 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0152 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0155 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00b6, B:27:0x00be, B:28:0x00c1, B:30:0x00c5, B:32:0x00cb, B:34:0x00cf, B:35:0x00d5, B:38:0x00dd, B:41:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x00fd, B:48:0x0103, B:49:0x0109, B:51:0x010d, B:52:0x0111, B:57:0x0124, B:59:0x0128, B:60:0x012f, B:66:0x0140, B:67:0x014a, B:69:0x0152, B:70:0x0155, B:76:0x015c), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:13:0x0093, B:21:0x00a6, B:23:0x00ac, B:103:0x0056, B:109:0x0062, B:112:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int advert(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e.advert(android.view.MotionEvent):int");
    }

    public final void amazon(C13915e c13915e) {
        this.f10636e.remoteconfig(c13915e, false);
        C12431e ads = c13915e.ads();
        Object[] objArr = ads.f24870e;
        int i = ads.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            amazon((C13915e) objArr[i2]);
        }
    }

    public final void applovin() {
        C12597e c12597e;
        if (this.f10646e) {
            C13128e c13128e = getSnapshotObserver().ad;
            synchronized (c13128e.billing) {
                try {
                    C12431e c12431e = c13128e.purchase;
                    int i = c12431e.f24868e;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        C14040e c14040e = (C14040e) c12431e.f24870e[i3];
                        c14040e.license();
                        if (!c14040e.purchase.adcel()) {
                            i2++;
                        } else if (i2 > 0) {
                            Object[] objArr = c12431e.f24870e;
                            objArr[i3 - i2] = objArr[i3];
                        }
                    }
                    int i4 = i - i2;
                    Arrays.fill(c12431e.f24870e, i4, i, (Object) null);
                    c12431e.f24868e = i4;
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f10646e = false;
        }
        C13213e c13213e = this.f10695e;
        if (c13213e != null) {
            billing(c13213e);
        }
        if (appmetrica() && (c12597e = this.f10633e) != null) {
            C16399e c16399e = c12597e.f25315e;
            if (c16399e.license == 0 && c12597e.f25317e) {
                c12597e.f25318e.ad();
                c12597e.f25317e = false;
            }
            if (c16399e.license != 0) {
                c12597e.f25317e = true;
            }
        }
        while (this.f10667e.mopub() && this.f10667e.yandex(0) != null) {
            int i5 = this.f10667e.vip;
            for (int i6 = 0; i6 < i5; i6++) {
                Function0 function0 = (Function0) this.f10667e.yandex(i6);
                this.f10667e.Signature(i6, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.f10667e.amazon(0, i5);
        }
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        if (appmetrica()) {
            C12597e c12597e = this.f10633e;
            if (c12597e != null) {
                c12597e.vip(sparseArray);
            }
            C0324e c0324e = this.f10612e;
            if (c0324e != null) {
                AbstractC11815e.m3259native(c0324e, sparseArray);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f10652e.smaato(i, this.f10639e, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f10652e.smaato(i, this.f10639e, true);
    }

    /* renamed from: class, reason: not valid java name */
    public final void m1698class(MotionEvent motionEvent) {
        this.f10654e = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC3582e interfaceC3582e = this.f10614e;
        float[] fArr = this.f10673e;
        interfaceC3582e.vip(this, fArr);
        AbstractC0014e.adcel(fArr, this.f10672e);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long vip = C6739e.vip((Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (vip >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (vip & 4294967295L));
        this.f10625e = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final void crashlytics() {
        ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = this.f10652e;
        viewOnAttachStateChangeListenerC2004e.f5239e = true;
        Handler handler = viewOnAttachStateChangeListenerC2004e.f5236e.getHandler();
        if (viewOnAttachStateChangeListenerC2004e.tapsense() && !viewOnAttachStateChangeListenerC2004e.f5222e && handler != null) {
            viewOnAttachStateChangeListenerC2004e.f5222e = true;
            handler.post(viewOnAttachStateChangeListenerC2004e.f5242e);
        }
        ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e = this.f10653e;
        viewOnAttachStateChangeListenerC5346e.f11469e = true;
        Handler handler2 = viewOnAttachStateChangeListenerC5346e.f11468e.getHandler();
        if (!viewOnAttachStateChangeListenerC5346e.license() || viewOnAttachStateChangeListenerC5346e.f11458e || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC5346e.f11458e = true;
        handler2.post(viewOnAttachStateChangeListenerC5346e.f11462e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C12328e c12328e = this.f10660e;
        if (!isAttachedToWindow()) {
            smaato(getRoot());
        }
        tapsense(true);
        AbstractC12909e.adcel().smaato();
        this.f10665e = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            C16125e c16125e = this.f10663e;
            C11648e c11648e = c16125e.ad;
            Canvas canvas2 = c11648e.ad;
            c11648e.ad = canvas;
            getRoot().adcel(c11648e, null);
            c16125e.ad.ad = canvas2;
            if (c12328e.mopub()) {
                int i = c12328e.vip;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C5048e) ((InterfaceC0983e) c12328e.yandex(i2))).purchase();
                }
            }
            int i3 = AbstractC16327e.f32076e;
            c12328e.purchase();
            this.f10665e = false;
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            C12328e c12328e2 = this.f10635e;
            if (c12328e2 != null) {
                c12328e.vip(c12328e2);
                c12328e2.purchase();
            }
            if (loadAd()) {
                AbstractC1771e.ad(this, this.f10694e);
                View view = this.f10617e;
                if (view != null) {
                    AbstractC1771e.ad(view, this.f10655e);
                    if (!Float.isNaN(this.f10655e)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f10694e = Float.NaN;
                this.f10655e = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:662:0x045e, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L260;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r5v85 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 2027
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0154, code lost:
    
        if (remoteconfig(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C8212e) getFocusOwner()).license(keyEvent, new C14194e(this, keyEvent, 0));
        }
        C1692e c1692e = getComposeViewContext().remoteconfig;
        int metaState = keyEvent.getMetaState();
        c1692e.getClass();
        AbstractC2924e.ad.setValue(new C3473e(metaState));
        return ((C8212e) getFocusOwner()).license(keyEvent, C7309e.f14943e) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C14742e c14742e;
        if (isFocused()) {
            C8212e c8212e = (C8212e) getFocusOwner();
            if (c8212e.license.appmetrica) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C11795e metrica = AbstractC11267e.metrica(c8212e.metrica);
                if (metrica != null) {
                    if (!metrica.f27022e.f27016e) {
                        AbstractC14070e.metrica("visitAncestors called on an unattached node");
                    }
                    AbstractC13616e abstractC13616e = metrica.f27022e;
                    C13915e mopub = AbstractC5851e.mopub(metrica);
                    while (mopub != null) {
                        if ((((AbstractC13616e) mopub.f27592e.billing).f27020e & 131072) != 0) {
                            while (abstractC13616e != null) {
                                if ((abstractC13616e.f27014e & 131072) != 0) {
                                    AbstractC13616e abstractC13616e2 = abstractC13616e;
                                    C12431e c12431e = null;
                                    while (abstractC13616e2 != null) {
                                        if ((abstractC13616e2.f27014e & 131072) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                                            int i = 0;
                                            for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                                if ((abstractC13616e3.f27014e & 131072) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        Unit unit = Unit.INSTANCE;
                                                        abstractC13616e2 = abstractC13616e3;
                                                    } else {
                                                        if (c12431e == null) {
                                                            c12431e = new C12431e(0, new AbstractC13616e[16]);
                                                        }
                                                        if (abstractC13616e2 != null) {
                                                            c12431e.license(abstractC13616e2);
                                                            abstractC13616e2 = null;
                                                        }
                                                        c12431e.license(abstractC13616e3);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                            }
                                        }
                                        abstractC13616e2 = AbstractC5851e.vip(c12431e);
                                    }
                                }
                                abstractC13616e = abstractC13616e.f27011e;
                            }
                        }
                        mopub = mopub.tapsense();
                        abstractC13616e = (mopub == null || (c14742e = mopub.f27592e) == null) ? null : (C9011e) c14742e.purchase;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C8301e.ad.ad(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c12351e;
        C11795e purchase;
        if (this.f10609e) {
            RunnableC7305e runnableC7305e = this.f10681e;
            removeCallbacks(runnableC7305e);
            MotionEvent motionEvent2 = this.f10616e;
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f10609e = false;
            } else {
                runnableC7305e.run();
            }
        }
        if (!admob(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || remoteconfig(motionEvent))) {
            int advert = advert(motionEvent);
            int i = 1;
            if ((advert & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c12351e = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c12351e = new C12351e(i);
                }
                if (c12351e.equals(new C12351e(i)) && (purchase = ((C8212e) getFocusOwner()).purchase()) != null) {
                    AbstractC17732e adcel = AbstractC5851e.adcel(purchase);
                    if (!AbstractC0890e.metrica(adcel).mo208goto(adcel, true).ad((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        AbstractC4653e.startapp(getFocusOwner());
                    }
                }
            }
            if ((advert & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m1699extends(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i2 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i2 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i2 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
        }
        int i5 = 0;
        while (i5 < pointerCount) {
            int i6 = ((i2 < 0 || i5 < i2) ? 0 : 1) + i5;
            motionEvent.getPointerProperties(i6, pointerPropertiesArr[i5]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i5];
            motionEvent.getPointerCoords(i6, pointerCoords);
            float f = pointerCoords.x;
            long signatures = signatures((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (signatures >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (signatures & 4294967295L));
            i5++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        this.f10683e.isVip(this.f10643e.metrica(obtain, this), this, true);
        obtain.recycle();
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return adcel(this, i);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void firebase() {
        if (this.f10634e) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f10654e) {
            this.f10654e = currentAnimationTimeMillis;
            InterfaceC3582e interfaceC3582e = this.f10614e;
            float[] fArr = this.f10673e;
            interfaceC3582e.vip(this, fArr);
            AbstractC0014e.adcel(fArr, this.f10672e);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f10696e;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            float f3 = iArr[0];
            float f4 = f2 - iArr[1];
            this.f10625e = (Float.floatToRawIntBits(f - f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eّؖٝ, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        C0763e ad;
        if (view == null || this.f10636e.metrica) {
            return super.focusSearch(view, i);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), view, i);
        if (findNextFocus == null || !C7582e.ad(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            C11795e metrica = AbstractC11267e.metrica(((C8212e) getFocusOwner()).metrica);
            ad = metrica != null ? AbstractC11267e.license(metrica) : null;
            if (ad == null) {
                ad = AbstractC12410e.ad(view, this);
            }
        } else {
            ad = AbstractC12410e.ad(view, this);
        }
        C10202e license = AbstractC12410e.license(i);
        int i2 = license != null ? license.ad : 6;
        ?? obj = new Object();
        if (((C8212e) getFocusOwner()).appmetrica(i2, ad, new C6229e(obj, 0)) == null) {
            return view;
        }
        Object obj2 = obj.f9318e;
        if (obj2 == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (findNextFocus == null || i2 == 1 || i2 == 2 || AbstractC12442e.applovin(AbstractC11267e.license((C11795e) obj2), AbstractC12410e.ad(findNextFocus, this), ad, i2)) {
            return this;
        }
        return findNextFocus;
    }

    /* renamed from: getAccessibilityManager, reason: merged with bridge method [inline-methods] */
    public C8127e m1710getAccessibilityManager() {
        return this.f10662e;
    }

    public final C13213e getAndroidViewsHandler$ui() {
        if (this.f10695e == null) {
            C13213e c13213e = new C13213e(getContext());
            this.f10695e = c13213e;
            addView(c13213e, -1);
            requestLayout();
        }
        return this.f10695e;
    }

    public InterfaceC2984e getAutofill() {
        return this.f10612e;
    }

    public AbstractC8914e getAutofillManager() {
        return this.f10633e;
    }

    public C12201e getAutofillTree() {
        return this.f10637e;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C2842e m1711getClipboard() {
        return this.f10685e;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C16615e m1712getClipboardManager() {
        return this.f10640e;
    }

    public final C14843e getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f10649e;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f10688e.getValue();
    }

    public final ViewOnAttachStateChangeListenerC5346e getContentCaptureManager$ui() {
        return this.f10653e;
    }

    public InterfaceC8850e getCoroutineContext() {
        return this.f10623e;
    }

    public InterfaceC14388e getDensity() {
        return (InterfaceC14388e) this.f10656e.getValue();
    }

    public ViewOnDragListenerC18365e getDragAndDropManager() {
        return this.f10642e;
    }

    public C0763e getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C11795e metrica = AbstractC11267e.metrica(((C8212e) getFocusOwner()).metrica);
            if (metrica != null) {
                return AbstractC11267e.license(metrica);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return AbstractC12410e.ad(findFocus, this);
        }
        return null;
    }

    public InterfaceC16054e getFocusOwner() {
        return this.f10615e;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0763e embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.ad);
            rect.top = Math.round(embeddedViewFocusRect.vip);
            rect.right = Math.round(embeddedViewFocusRect.metrica);
            rect.bottom = Math.round(embeddedViewFocusRect.license);
            return;
        }
        if (AbstractC7890e.billing(((C8212e) getFocusOwner()).appmetrica(6, null, C5430e.f11633e), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
        }
    }

    public InterfaceC2141e getFontFamilyResolver() {
        return (InterfaceC2141e) this.f10651e.getValue();
    }

    public InterfaceC14165e getFontLoader() {
        return this.f10624e;
    }

    public final InterfaceC14745e getFrameEndScheduler$ui() {
        return this.f10690e;
    }

    public InterfaceC2661e getGraphicsContext() {
        return this.f10648e;
    }

    public InterfaceC5178e getHapticFeedBack() {
        return this.f10664e;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f10636e.vip.m4530catch() || !this.f10675e.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC13130e getInputModeManager() {
        return this.f10629e;
    }

    public final RunnableC7521e getInsetsListener() {
        return this.f10622e;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f10654e;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC7792e getLayoutDirection() {
        return (EnumC7792e) this.f10628e.getValue();
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public C3123e m1714getLayoutNodes() {
        return this.f10674e;
    }

    public C4622e getLocaleList() {
        return (C4622e) this.f10687e.getValue();
    }

    public long getMeasureIteration() {
        C6086e c6086e = this.f10636e;
        if (!c6086e.metrica) {
            AbstractC14070e.ad("measureIteration should be only used during the measure/layout pass");
        }
        return c6086e.billing;
    }

    public C5409e getModifierLocalManager() {
        return this.f10679e;
    }

    /* renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public ViewTreeObserverOnGlobalLayoutListenerC5014e m1715getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC3698e getPlacementScope() {
        int i = AbstractC18259e.vip;
        return new C17712e(1, this);
    }

    public InterfaceC15058e getPointerIconService() {
        return this.f10627e;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C7180e m1700getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f10666e;
    }

    public C4930e getRectManager() {
        return this.f10678e;
    }

    public InterfaceC8493e getRetainedValuesStore() {
        return this.f10650e;
    }

    public C13915e getRoot() {
        return this.f10658e;
    }

    public InterfaceC8941e getRootForTest() {
        return this;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C7407e c7407e;
        if (Build.VERSION.SDK_INT < 31 || (c7407e = this.f10680e) == null) {
            return false;
        }
        return ((Boolean) ((C0576e) c7407e.vip).getValue()).booleanValue();
    }

    public C3537e getSemanticsOwner() {
        return this.f10657e;
    }

    public C4017e getSharedDrawScope() {
        return this.f10610e;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C16963e.ad.ad(this) : this.f10677e;
    }

    public C15087e getSnapshotObserver() {
        return this.f10671e;
    }

    public InterfaceC3965e getSoftwareKeyboardController() {
        C3112e c3112e = this.f10631e;
        if (c3112e != null) {
            return c3112e;
        }
        C3112e c3112e2 = new C3112e(getTextInputService());
        this.f10631e = c3112e2;
        return c3112e2;
    }

    public C7452e getTextInputService() {
        C7452e c7452e = this.f10668e;
        if (c7452e != null) {
            return c7452e;
        }
        C7452e c7452e2 = new C7452e(getLegacyTextInputServiceAndroid());
        this.f10668e = c7452e2;
        return c7452e2;
    }

    public InterfaceC4358e getTextToolbar() {
        return this.f10613e;
    }

    public final InterfaceC4286e getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    public InterfaceC11678e getViewConfiguration() {
        return this.f10692e;
    }

    public final AbstractC4728e getViewTreeOwners() {
        AbstractC1786e.applovin(this.f10630e.getValue());
        return null;
    }

    public InterfaceC3075e getWindowInfo() {
        return getComposeViewContext().remoteconfig;
    }

    public final C12597e get_autofillManager$ui() {
        return this.f10633e;
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m1701goto(C13915e c13915e) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c13915e != null) {
            while (c13915e != null && c13915e.remoteconfig() == 1) {
                if (!this.f10645e) {
                    C13915e tapsense = c13915e.tapsense();
                    if (tapsense == null) {
                        break;
                    }
                    long j = ((C14747e) tapsense.f27592e.license).f6805e;
                    if (C5602e.purchase(j) && C5602e.appmetrica(j)) {
                        break;
                    }
                }
                c13915e = c13915e.tapsense();
            }
            if (c13915e == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final boolean inmobi(int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        Integer metrica = AbstractC12410e.metrica(i);
        if (metrica == null) {
            throw AbstractC8703e.Signature("Invalid focus direction");
        }
        int intValue = metrica.intValue();
        C11795e purchase = ((C8212e) getFocusOwner()).purchase();
        if (purchase == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer metrica2 = AbstractC12410e.metrica(i);
        if (metrica2 == null) {
            throw AbstractC8703e.Signature("Invalid focus direction");
        }
        int intValue2 = metrica2.intValue();
        C9820e c9820e = AbstractC5851e.mopub(purchase).f27596e;
        View interopView = c9820e != null ? c9820e.getInteropView() : null;
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus(), intValue2);
        if (findNextFocus == null || interopView == null || !C7582e.ad(interopView, findNextFocus)) {
            findNextFocus = null;
        }
        if (findNextFocus != null) {
            return AbstractC12410e.vip(findNextFocus, Integer.valueOf(intValue), null);
        }
        return false;
    }

    /* renamed from: interface, reason: not valid java name */
    public final boolean m1702interface() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void isPro(InterfaceC0983e interfaceC0983e, boolean z) {
        C12328e c12328e = this.f10660e;
        if (!z) {
            if (this.f10665e) {
                return;
            }
            c12328e.advert(interfaceC0983e);
            C12328e c12328e2 = this.f10635e;
            if (c12328e2 != null) {
                c12328e2.advert(interfaceC0983e);
                return;
            }
            return;
        }
        if (!this.f10665e) {
            c12328e.ad(interfaceC0983e);
            return;
        }
        C12328e c12328e3 = this.f10635e;
        if (c12328e3 == null) {
            c12328e3 = new C12328e();
            this.f10635e = c12328e3;
        }
        c12328e3.ad(interfaceC0983e);
    }

    public final void isVip(C13915e c13915e, long j) {
        C6086e c6086e = this.f10636e;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c6086e.amazon(c13915e, j);
            if (!c6086e.vip.m4530catch()) {
                c6086e.metrica(false);
                getRectManager().ad();
                if (this.f10661e) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f10661e = false;
                }
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void mopub(C13915e c13915e, boolean z) {
        this.f10636e.yandex(c13915e, z);
    }

    /* renamed from: native, reason: not valid java name */
    public final int m1703native(MotionEvent motionEvent) {
        Object obj;
        if (this.f10669e) {
            this.f10669e = false;
            C1692e c1692e = getComposeViewContext().remoteconfig;
            int metaState = motionEvent.getMetaState();
            c1692e.getClass();
            AbstractC2924e.ad.setValue(new C3473e(metaState));
        }
        C9351e c9351e = this.f10643e;
        C11883e metrica = c9351e.metrica(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        C12344e c12344e = this.f10683e;
        if (metrica == null) {
            if (!c12344e.f24750e) {
                ((C2692e) ((C2362e) c12344e.f24748e).f5914e).vip();
                ((C10780e) c12344e.f24751e).metrica();
            }
            return 0;
        }
        List list = (List) metrica.f23815e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                obj = list.get(size);
                if (((C13567e) obj).appmetrica && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        obj = null;
        C13567e c13567e = (C13567e) obj;
        if (c13567e != null) {
            this.f10639e = c13567e.license;
        }
        int isVip = c12344e.isVip(metrica, this, subscription(motionEvent));
        metrica.f23814e = null;
        if ((actionMasked != 0 && actionMasked != 5) || (isVip & 1) != 0) {
            return isVip;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c9351e.metrica.delete(pointerId);
        c9351e.vip.delete(pointerId);
        return isVip;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC8493e interfaceC8493e;
        Object obj;
        C0324e c0324e;
        super.onAttachedToWindow();
        setAttached(true);
        int i = Build.VERSION.SDK_INT;
        if (i < 30) {
            setShowLayoutBounds(AbstractC4584e.vip());
        }
        this.f10622e.onViewAttachedToWindow(this);
        int i2 = 0;
        if (i > 28) {
            if (f10604e == null) {
                RunnableC5512e runnableC5512e = new RunnableC5512e(r0);
                f10604e = runnableC5512e;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f10603e == null) {
                        f10603e = Class.forName("android.os.SystemProperties");
                    }
                    if (f10608e == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f10603e;
                        f10608e = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f10608e;
                    if (method != null) {
                        method.invoke(null, runnableC5512e);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C12328e c12328e = f10606e;
            synchronized (c12328e) {
                c12328e.ad(this);
                Unit unit = Unit.INSTANCE;
            }
        }
        if (!this.f10649e) {
            getComposeViewContext().metrica();
        }
        this.f10649e = false;
        amazon(getRoot());
        smaato(getRoot());
        getSnapshotObserver().ad.license();
        if (appmetrica() && (c0324e = this.f10612e) != null) {
            C1203e.ad.ad(c0324e);
        }
        InterfaceC16400e interfaceC16400e = getComposeViewContext().metrica;
        InterfaceC0816e interfaceC0816e = getComposeViewContext().appmetrica;
        InterfaceC14745e interfaceC14745e = this.f10690e;
        if (interfaceC16400e == null || interfaceC0816e == null || interfaceC14745e == null) {
            interfaceC8493e = null;
        } else {
            C11106e c11106e = new C11106e(interfaceC0816e.billing(), new C6607e(12), C8567e.vip);
            InterfaceC7227e vip = AbstractC3820e.ad.vip(C10713e.class);
            String license = vip.license();
            if (license == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C10713e c10713e = (C10713e) c11106e.m2999abstract(vip, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(license));
            int id = ((View) getParent()).getId();
            C3123e c3123e = c10713e.vip;
            Object vip2 = c3123e.vip(id);
            if (vip2 == null) {
                vip2 = new C12328e(1);
                c3123e.startapp(id, vip2);
            }
            C12328e c12328e2 = (C12328e) vip2;
            Object[] objArr = c12328e2.ad;
            int i3 = c12328e2.vip;
            while (true) {
                if (i2 >= i3) {
                    obj = null;
                    break;
                }
                obj = objArr[i2];
                if (!((C16965e) obj).metrica) {
                    break;
                } else {
                    i2++;
                }
            }
            C16965e c16965e = (C16965e) obj;
            if (c16965e == null) {
                c16965e = new C16965e();
                c12328e2.ad(c16965e);
            }
            c16965e.metrica = true;
            this.f10689e = c16965e;
            interfaceC8493e = c16965e.vip;
        }
        if (interfaceC8493e == null) {
            interfaceC8493e = C17354e.f34036e;
        }
        this.f10650e = interfaceC8493e;
        Function1 function1 = this.f10676e;
        if (function1 != null) {
            function1.invoke(getComposeViewContext());
            this.f10676e = null;
        }
        AbstractC0003e vip3 = getComposeViewContext().metrica.vip();
        vip3.ad(this);
        vip3.ad(this.f10653e);
        this.f10629e.ad.setValue(new C12713e(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C8315e.ad.vip(this);
        }
        C12597e c12597e = this.f10633e;
        if (c12597e != null) {
            ((C8212e) getFocusOwner()).billing.ad(c12597e);
            getSemanticsOwner().license.ad(c12597e);
        }
        ((C8212e) getFocusOwner()).billing.ad(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C3629e c3629e = (C3629e) this.f10691e.get();
        C12747e c12747e = (C12747e) (c3629e != null ? c3629e.vip : null);
        if (c12747e == null) {
            return getLegacyTextInputServiceAndroid().license;
        }
        C3629e c3629e2 = (C3629e) c12747e.f25503e.get();
        C17497e c17497e = (C17497e) (c3629e2 != null ? c3629e2.vip : null);
        return c17497e != null && (c17497e.appmetrica ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1709while(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0058  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e = this.f10653e;
        viewOnAttachStateChangeListenerC5346e.getClass();
        AbstractC16048e.isPro(viewOnAttachStateChangeListenerC5346e, jArr, consumer);
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onDestroy(InterfaceC16400e interfaceC16400e) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C0324e c0324e;
        super.onDetachedFromWindow();
        setAttached(false);
        this.f10622e.onViewDetachedFromWindow(this);
        View view = this.f10617e;
        if (loadAd() && view != null) {
            removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            C12328e c12328e = f10606e;
            synchronized (c12328e) {
                c12328e.advert(this);
                Unit unit = Unit.INSTANCE;
            }
        }
        getComposeViewContext().vip();
        C13128e c13128e = getSnapshotObserver().ad;
        C2007e c2007e = c13128e.yandex;
        if (c2007e != null) {
            c2007e.vip();
        }
        c13128e.ad();
        AbstractC0003e vip = getComposeViewContext().metrica.vip();
        vip.vip(this.f10653e);
        vip.vip(this);
        if (appmetrica() && (c0324e = this.f10612e) != null) {
            C1203e.ad.vip(c0324e);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        C16965e c16965e = this.f10689e;
        if (c16965e != null) {
            c16965e.metrica = false;
        }
        this.f10689e = null;
        if (i >= 31) {
            C8315e.ad.ad(this);
        }
        C12597e c12597e = this.f10633e;
        if (c12597e != null) {
            getSemanticsOwner().license.advert(c12597e);
            ((C8212e) getFocusOwner()).billing.advert(c12597e);
        }
        C4930e rectManager = getRectManager();
        rectManager.purchase = rectManager.metrica.vip(0L, 0L, null, 0, 0);
        getRectManager().ad();
        C4930e rectManager2 = getRectManager();
        RunnableC7547e runnableC7547e = rectManager2.yandex;
        if (runnableC7547e != null) {
            ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e = rectManager2.ad;
            if (!AbstractC0869e.premium(runnableC7547e)) {
                runnableC7547e = null;
            }
            if (runnableC7547e != null) {
                viewTreeObserverOnGlobalLayoutListenerC5014e.removeCallbacks(runnableC7547e);
            }
            rectManager2.yandex = null;
        }
        ((C8212e) getFocusOwner()).billing.advert(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C8212e c8212e = (C8212e) getFocusOwner();
        AbstractC8439e.license(c8212e.metrica, true);
        if (c8212e.purchase() != null) {
            C11795e purchase = c8212e.purchase();
            c8212e.startapp(null);
            if (purchase != null) {
                purchase.m3235e(EnumC16488e.f32316e, EnumC16488e.f32315e);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f10654e = 0L;
        m1708try();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m1709while(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f10654e = 0L;
            this.f10636e.smaato(this.f10638e);
            this.f10670e = null;
            m1708try();
            if (this.f10695e != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C6086e c6086e = this.f10636e;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                amazon(getRoot());
            }
            long yandex = yandex(i);
            long yandex2 = yandex(i2);
            long metrica = AbstractC15118e.metrica((int) (yandex >>> 32), (int) (yandex & 4294967295L), (int) (yandex2 >>> 32), (int) (4294967295L & yandex2));
            C5602e c5602e = this.f10670e;
            if (c5602e == null) {
                this.f10670e = new C5602e(metrica);
                this.f10645e = false;
            } else if (!C5602e.vip(c5602e.ad, metrica)) {
                this.f10645e = true;
            }
            c6086e.pro(metrica);
            c6086e.loadAd();
            setMeasuredDimension(getRoot().f27612e.Signature.f6806e, getRoot().f27612e.Signature.f6804e);
            if (this.f10695e != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f27612e.Signature.f6806e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f27612e.Signature.f6804e, 1073741824));
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
            Unit unit2 = Unit.INSTANCE;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onPause(InterfaceC16400e interfaceC16400e) {
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (!appmetrica() || viewStructure == null) {
            return;
        }
        C12597e c12597e = this.f10633e;
        if (c12597e != null) {
            C13915e c13915e = c12597e.f25314e.ad;
            AutofillId autofillId = c12597e.f25319e;
            String str = c12597e.f25312e;
            C4930e c4930e = c12597e.f25316e;
            AbstractC2194e.metrica(viewStructure, c13915e, autofillId, str, c4930e);
            Object[] objArr = AbstractC4180e.ad;
            C12328e c12328e = new C12328e(2);
            c12328e.ad(c13915e);
            c12328e.ad(viewStructure);
            while (c12328e.mopub()) {
                ViewStructure viewStructure2 = (ViewStructure) c12328e.smaato(c12328e.vip - 1);
                C8794e c8794e = (C8794e) ((C13915e) c12328e.smaato(c12328e.vip - 1)).loadAd();
                int i2 = ((C12431e) c8794e.f17708e).f24868e;
                for (int i3 = 0; i3 < i2; i3++) {
                    C13915e c13915e2 = (C13915e) c8794e.get(i3);
                    if (!c13915e2.f27620e && c13915e2.m3708extends() && c13915e2.m3724throw()) {
                        C0500e inmobi = c13915e2.inmobi();
                        if (inmobi != null) {
                            C0583e c0583e = inmobi.f2578e;
                            if (c0583e.vip(AbstractC10789e.billing) || c0583e.vip(AbstractC10789e.yandex) || c0583e.vip(AbstractC9058e.subscription) || c0583e.vip(AbstractC9058e.remoteconfig)) {
                                ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                AbstractC2194e.metrica(newChild, c13915e2, c12597e.f25319e, str, c4930e);
                                c12328e.ad(c13915e2);
                                c12328e.ad(newChild);
                            }
                        }
                        c12328e.ad(c13915e2);
                        c12328e.ad(viewStructure2);
                    }
                }
            }
        }
        C0324e c0324e = this.f10612e;
        if (c0324e != null) {
            C12201e c12201e = c0324e.vip;
            LinkedHashMap linkedHashMap = c12201e.ad;
            LinkedHashMap linkedHashMap2 = c12201e.ad;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int intValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    throw new ClassCastException();
                }
                ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                C15796e.purchase(newChild2, c0324e.license, intValue);
                newChild2.setId(intValue, c0324e.ad.getContext().getPackageName(), null, null);
                C15796e.billing(newChild2, 1);
                throw null;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        InterfaceC15690e interfaceC15690e;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC15690e = ((C2313e) getPointerIconService()).ad) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return interfaceC15690e instanceof C14298e ? PointerIcon.getSystemIcon(context, ((C14298e) interfaceC15690e).vip) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // defpackage.InterfaceC13619e
    public final void onResume(InterfaceC16400e interfaceC16400e) {
        InterfaceC3399e interfaceC3399e;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC4584e.vip());
        }
        C16965e c16965e = this.f10689e;
        if (c16965e != null) {
            InterfaceC14745e interfaceC14745e = this.f10690e;
            C2362e c2362e = c16965e.ad;
            C13245e c13245e = (C13245e) c2362e.f5914e;
            if (!c13245e.f26278e || c13245e.f26275e) {
                return;
            }
            try {
                interfaceC3399e = ((C15273e) interfaceC14745e).f30202e.remoteconfig(new C17073e(10, c16965e));
            } catch (CancellationException unused) {
                C13245e c13245e2 = (C13245e) c2362e.f5914e;
                if (!c13245e2.f26276e) {
                    if (c13245e2.f26275e) {
                        AbstractC0143e.ad("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c13245e2.ad();
                    c13245e2.f26275e = true;
                }
                interfaceC3399e = null;
            }
            InterfaceC3399e interfaceC3399e2 = c16965e.license;
            if (interfaceC3399e2 != null) {
                interfaceC3399e2.cancel();
            }
            c16965e.license = interfaceC3399e;
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f10619e) {
            int[] iArr = AbstractC12410e.ad;
            EnumC7792e enumC7792e = EnumC7792e.f15794e;
            EnumC7792e enumC7792e2 = i != 0 ? i != 1 ? null : EnumC7792e.f15793e : enumC7792e;
            if (enumC7792e2 != null) {
                enumC7792e = enumC7792e2;
            }
            setLayoutDirection(enumC7792e);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C7407e c7407e;
        if (Build.VERSION.SDK_INT < 31 || (c7407e = this.f10680e) == null) {
            return;
        }
        c7407e.metrica(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m1708try();
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void onStart(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStop(InterfaceC16400e interfaceC16400e) {
        C16965e c16965e = this.f10689e;
        if (c16965e != null) {
            C13245e c13245e = (C13245e) c16965e.ad.f5914e;
            if (c13245e.f26278e && !c13245e.f26275e) {
                InterfaceC3399e interfaceC3399e = c16965e.license;
                if (interfaceC3399e != null) {
                    interfaceC3399e.cancel();
                }
                c16965e.license = null;
                return;
            }
            if (c13245e.f26276e) {
                return;
            }
            if (!c13245e.f26275e) {
                AbstractC0143e.ad("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!c13245e.f26277e.startapp()) {
                AbstractC0143e.ad("Attempted to start retaining exited values with pending exited values");
            }
            c13245e.f26275e = false;
        }
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        this.f10629e.ad.setValue(new C12713e(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e = this.f10653e;
        viewOnAttachStateChangeListenerC5346e.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC7890e.billing(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC16048e.purchase(viewOnAttachStateChangeListenerC5346e, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC5346e.f11468e.post(new RunnableC16019e(viewOnAttachStateChangeListenerC5346e, longSparseArray, 2));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean vip;
        this.f10669e = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (vip = AbstractC4584e.vip())) {
            return;
        }
        setShowLayoutBounds(vip);
        smaato(getRoot());
    }

    public final void premium(C13915e c13915e, boolean z, boolean z2, boolean z3) {
        C13915e tapsense;
        C13915e tapsense2;
        C6086e c6086e = this.f10636e;
        if (!z) {
            if (c6086e.remoteconfig(c13915e, z2) && z3) {
                m1701goto(c13915e);
                return;
            }
            return;
        }
        C18478e c18478e = c6086e.vip;
        C13915e c13915e2 = c13915e.f27587e;
        C11874e c11874e = c13915e.f27612e;
        if (c13915e2 == null) {
            AbstractC14070e.metrica("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int m2467class = AbstractC8703e.m2467class(c11874e.license);
        if (m2467class != 0) {
            if (m2467class == 1) {
                return;
            }
            if (m2467class != 2 && m2467class != 3) {
                if (m2467class != 4) {
                    throw new C14803e(10);
                }
                if (!c11874e.appmetrica || z2) {
                    c11874e.appmetrica = true;
                    c11874e.Signature.f25185e = true;
                    if (c13915e.f27620e) {
                        return;
                    }
                    if ((AbstractC7890e.billing(c13915e.m3728while(), Boolean.TRUE) || C6086e.adcel(c13915e)) && ((tapsense = c13915e.tapsense()) == null || !tapsense.f27612e.appmetrica)) {
                        c18478e.subscription(1, c13915e);
                    } else if ((c13915e.m3724throw() || C6086e.mopub(c13915e)) && ((tapsense2 = c13915e.tapsense()) == null || !tapsense2.subscription())) {
                        c18478e.subscription(3, c13915e);
                    }
                    if (c6086e.license || !z3) {
                        return;
                    }
                    m1701goto(c13915e);
                    return;
                }
                return;
            }
        }
        c6086e.yandex.license(new C11319e(c13915e, true, z2));
    }

    public final void pro(float[] fArr) {
        firebase();
        C6739e.startapp(fArr, this.f10673e);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f10625e >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f10625e & 4294967295L));
        float[] fArr2 = this.f10682e;
        C6739e.license(fArr2);
        C6739e.adcel(fArr2, intBitsToFloat, intBitsToFloat2);
        C7582e.Signature(fArr, fArr2);
    }

    /* renamed from: protected, reason: not valid java name */
    public final void m1704protected(float f) {
        if (loadAd()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f10694e) || f > this.f10694e) {
                    this.f10694e = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f10655e) || f < this.f10655e) {
                    this.f10655e = f;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final /* synthetic */ void purchase() {
    }

    public final boolean remoteconfig(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f10616e) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            C10202e license = AbstractC12410e.license(i);
            int i2 = license != null ? license.ad : 7;
            Boolean appmetrica = ((C8212e) getFocusOwner()).appmetrica(i2, rect != null ? AbstractC9764e.advert(rect) : null, new C14202e(i2, 0));
            Boolean bool = Boolean.TRUE;
            if (!AbstractC7890e.billing(appmetrica, bool)) {
                if (!AbstractC7890e.billing(((C8212e) getFocusOwner()).appmetrica(i2, null, new C14202e(i2, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((C8212e) getFocusOwner()).yandex(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f10652e.f5225e = j;
    }

    public final void setComposeViewContext(C14843e c14843e) {
        if (getCoroutineContext() != c14843e.vip.adcel() && !((C8794e) getRoot().loadAd()).isEmpty()) {
            AbstractC14070e.ad("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            C14843e c14843e2 = get_composeViewContext();
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            if (c14843e.equals(c14843e2)) {
                return;
            }
            if (isAttachedToWindow()) {
                c14843e2.vip();
                c14843e.metrica();
            }
            set_composeViewContext(c14843e);
            setCoroutineContext(c14843e.vip.adcel());
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f10649e = z;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f10688e.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC5346e viewOnAttachStateChangeListenerC5346e) {
        this.f10653e = viewOnAttachStateChangeListenerC5346e;
    }

    public void setCoroutineContext(InterfaceC8850e interfaceC8850e) {
        this.f10623e = interfaceC8850e;
    }

    public final void setFrameEndScheduler$ui(InterfaceC14745e interfaceC14745e) {
        this.f10690e = interfaceC14745e;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f10654e = j;
    }

    public final void setOnReadyForComposition(Function1<? super C14843e, Unit> function1) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f10649e) {
            function1.invoke(getComposeViewContext());
        } else {
            this.f10676e = function1;
        }
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m1705setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C7180e c7180e) {
        this.f10666e = c7180e;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f10677e = z;
    }

    public void setUncaughtExceptionHandler(InterfaceC4286e interfaceC4286e) {
        this.f10636e.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(InterfaceC4286e interfaceC4286e) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final long signatures(long j) {
        firebase();
        long vip = C6739e.vip(j, this.f10673e);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f10625e >> 32)) + Float.intBitsToFloat((int) (vip >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f10625e & 4294967295L)) + Float.intBitsToFloat((int) (vip & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final InterfaceC0983e startapp(Function2 function2, C13479e c13479e, C16446e c16446e) {
        C12431e c12431e;
        Reference poll;
        Object obj;
        if (c16446e != null) {
            return new C5048e(c16446e, null, this, function2, c13479e);
        }
        do {
            C3168e c3168e = this.f10621e;
            ReferenceQueue referenceQueue = (ReferenceQueue) c3168e.f7272e;
            c12431e = (C12431e) c3168e.f7271e;
            poll = referenceQueue.poll();
            if (poll != null) {
                c12431e.smaato(poll);
            }
        } while (poll != null);
        while (true) {
            int i = c12431e.f24868e;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) c12431e.amazon(i - 1)).get();
            if (obj != null) {
                break;
            }
        }
        InterfaceC0983e interfaceC0983e = (InterfaceC0983e) obj;
        if (interfaceC0983e == null) {
            return new C5048e(getGraphicsContext().metrica(), getGraphicsContext(), this, function2, c13479e);
        }
        C5048e c5048e = (C5048e) interfaceC0983e;
        InterfaceC2661e interfaceC2661e = c5048e.f10763e;
        if (interfaceC2661e == null) {
            throw AbstractC8703e.Signature("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!c5048e.f10772e.remoteconfig) {
            AbstractC14070e.ad("layer should have been released before reuse");
        }
        c5048e.f10772e = interfaceC2661e.metrica();
        c5048e.f10773e = false;
        c5048e.f10770e = function2;
        c5048e.f10755e = c13479e;
        c5048e.f10764e = false;
        c5048e.f10762e = false;
        c5048e.f10769e = true;
        C6739e.license(c5048e.f10767e);
        float[] fArr = c5048e.f10771e;
        if (fArr != null) {
            C6739e.license(fArr);
        }
        c5048e.f10765e = C13220e.vip;
        c5048e.f10775e = false;
        long j = Alert.DURATION_SHOW_INDEFINITELY;
        c5048e.f10774e = (j & 4294967295L) | (j << 32);
        c5048e.f10766e = null;
        c5048e.f10761e = 0;
        return interfaceC0983e;
    }

    public final void subs(C13915e c13915e, boolean z, boolean z2) {
        C11874e c11874e = c13915e.f27612e;
        C6086e c6086e = this.f10636e;
        if (!z) {
            c6086e.getClass();
            int m2467class = AbstractC8703e.m2467class(c11874e.license);
            if (m2467class == 0 || m2467class == 1 || m2467class == 2 || m2467class == 3) {
                return;
            }
            if (m2467class != 4) {
                throw new C14803e(10);
            }
            C13915e tapsense = c13915e.tapsense();
            boolean z3 = tapsense == null || tapsense.m3724throw();
            if (!z2) {
                if (c13915e.subscription()) {
                    return;
                }
                if (c13915e.admob() && c13915e.m3724throw() == z3 && c13915e.m3724throw() == c11874e.Signature.f25214e) {
                    return;
                }
            }
            C12570e c12570e = c11874e.Signature;
            c12570e.f25200e = true;
            c12570e.f25206e = true;
            if (!c13915e.f27620e && c12570e.f25214e && z3) {
                if ((tapsense == null || !tapsense.admob()) && (tapsense == null || !tapsense.subscription())) {
                    c6086e.vip.subscription(4, c13915e);
                }
                if (c6086e.license) {
                    return;
                }
                m1701goto(null);
                return;
            }
            return;
        }
        C18478e c18478e = c6086e.vip;
        int m2467class2 = AbstractC8703e.m2467class(c11874e.license);
        if (m2467class2 != 0) {
            if (m2467class2 == 1) {
                return;
            }
            if (m2467class2 != 2) {
                if (m2467class2 == 3) {
                    return;
                }
                if (m2467class2 != 4) {
                    throw new C14803e(10);
                }
            }
        }
        if ((c11874e.appmetrica || c11874e.purchase) && !z2) {
            return;
        }
        c11874e.purchase = true;
        c11874e.billing = true;
        C12570e c12570e2 = c11874e.Signature;
        c12570e2.f25200e = true;
        c12570e2.f25206e = true;
        if (c13915e.f27620e) {
            return;
        }
        C13915e tapsense2 = c13915e.tapsense();
        if (AbstractC7890e.billing(c13915e.m3728while(), Boolean.TRUE) && ((tapsense2 == null || !tapsense2.f27612e.appmetrica) && (tapsense2 == null || !tapsense2.f27612e.purchase))) {
            c18478e.subscription(2, c13915e);
        } else if (c13915e.m3724throw() && ((tapsense2 == null || !tapsense2.admob()) && (tapsense2 == null || !tapsense2.subscription()))) {
            c18478e.subscription(4, c13915e);
        }
        if (c6086e.license) {
            return;
        }
        m1701goto(null);
    }

    public final boolean subscription(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    public final void tapsense(boolean z) {
        C16598e c16598e;
        C6086e c6086e = this.f10636e;
        if (c6086e.vip.m4530catch() || ((C12431e) c6086e.appmetrica.f12440e).f24868e != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z) {
                try {
                    c16598e = this.f10638e;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                c16598e = null;
            }
            if (c6086e.smaato(c16598e)) {
                requestLayout();
            }
            c6086e.metrica(false);
            getRectManager().ad();
            if (this.f10661e) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f10661e = false;
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        }
    }

    /* renamed from: this, reason: not valid java name */
    public final long m1706this(long j) {
        firebase();
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f10625e >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f10625e & 4294967295L));
        return C6739e.vip((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f10672e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: throw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1707throw(kotlin.jvm.functions.Function2 r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C18199e
            if (r0 == 0) goto L13
            r0 = r6
            eٚٝ r0 = (defpackage.C18199e) r0
            int r1 = r0.f35614e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35614e = r1
            goto L18
        L13:
            eٚٝ r0 = new eٚٝ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f35613e
            int r1 = r0.f35614e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.AbstractC2003e.purchase(r6)
            goto L49
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            eؕؐٔ r6 = new eؕؐٔ
            r1 = 2
            r6.<init>(r4, r1)
            r0.f35614e = r2
            eًْۖ r1 = new eًْۖ
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r4.f10691e
            r1.<init>(r6, r3, r5, r2)
            java.lang.Object r5 = defpackage.AbstractC9743e.appmetrica(r1, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L49
            return
        L49:
            eٔٚؖ r5 = new eٔٚؖ
            r6 = 9
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e.m1707throw(kotlin.jvm.functions.Function2, eُؑ۠):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* renamed from: try, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1708try() {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ViewTreeObserverOnGlobalLayoutListenerC5014e.m1708try():void");
    }

    /* renamed from: while, reason: not valid java name */
    public final void m1709while(Configuration configuration) {
        C0576e c0576e;
        Configuration configuration2 = getConfiguration();
        if (AbstractC7890e.billing(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC12315e.ad(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) == 0 || (c0576e = this.f10644e.vip) == null) {
            return;
        }
        c0576e.setValue(AbstractC8508e.ad(this));
    }
}
