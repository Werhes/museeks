package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10017e implements InterfaceC15269e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f19784e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f19785e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f19786e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Object f19787e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f19788e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19789e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Object f19790e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f19791e;

    public C10017e(int i) {
        this.f19789e = i;
        switch (i) {
            case 5:
                this.f19786e = new AtomicBoolean();
                this.f19785e = null;
                this.f19788e = new HashMap(16, 1.0f);
                this.f19784e = new HashMap(16, 1.0f);
                this.f19791e = new HashMap(16, 1.0f);
                this.f19790e = new HashMap(16, 1.0f);
                this.f19787e = null;
                return;
            default:
                return;
        }
    }

    public C10017e(Context context) {
        this.f19789e = 0;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f19784e = layoutParams;
        this.f19791e = new Rect();
        this.f19790e = new int[2];
        this.f19787e = new int[2];
        this.f19786e = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f19785e = inflate;
        this.f19788e = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(C10017e.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public C10017e(C6399e c6399e, C3434e c3434e, C0069e c0069e, AbstractC14601e abstractC14601e, InterfaceC10500e interfaceC10500e, C5874e c5874e) {
        Object keySet;
        this.f19789e = 2;
        this.f19786e = c6399e;
        this.f19785e = c3434e;
        this.f19788e = c0069e;
        this.f19784e = abstractC14601e;
        this.f19791e = interfaceC10500e;
        this.f19790e = c5874e;
        Map map = (Map) c5874e.purchase(AbstractC6216e.ad);
        this.f19787e = (map == null || (keySet = map.keySet()) == null) ? C3295e.f7451e : keySet;
    }

    public C10017e(InterfaceC18006e interfaceC18006e, InterfaceC18006e interfaceC18006e2, InterfaceC18006e interfaceC18006e3, InterfaceC18006e interfaceC18006e4, InterfaceC18006e interfaceC18006e5, InterfaceC18006e interfaceC18006e6, C15816e c15816e) {
        this.f19789e = 3;
        this.f19786e = interfaceC18006e;
        this.f19785e = interfaceC18006e2;
        this.f19788e = interfaceC18006e3;
        this.f19784e = interfaceC18006e4;
        this.f19791e = interfaceC18006e5;
        this.f19790e = interfaceC18006e6;
        this.f19787e = c15816e;
    }

    public C10017e(String str, C14461e c14461e, C12894e c12894e) {
        this.f19789e = 4;
        this.f19784e = new C5609e(this, false);
        this.f19791e = new C5609e(this, true);
        this.f19790e = new C7417e(2);
        this.f19787e = new AtomicMarkableReference(null, false);
        this.f19788e = str;
        this.f19786e = new C12389e(c14461e);
        this.f19785e = c12894e;
    }

    public C6884e ad() {
        String str = ((Size) this.f19786e) == null ? " resolution" : BuildConfig.FLAVOR;
        if (((Size) this.f19785e) == null) {
            str = str.concat(" originalConfiguredResolution");
        }
        if (((C14677e) this.f19788e) == null) {
            str = AbstractC10257e.adcel(str, " dynamicRange");
        }
        if (((Integer) this.f19784e) == null) {
            str = AbstractC10257e.adcel(str, " sessionType");
        }
        if (((Range) this.f19791e) == null) {
            str = AbstractC10257e.adcel(str, " expectedFrameRateRange");
        }
        if (((Boolean) this.f19787e) == null) {
            str = AbstractC10257e.adcel(str, " zslDisabled");
        }
        if (str.isEmpty()) {
            return new C6884e((Size) this.f19786e, (Size) this.f19785e, (C14677e) this.f19788e, ((Integer) this.f19784e).intValue(), (Range) this.f19791e, (InterfaceC12330e) this.f19790e, ((Boolean) this.f19787e).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C4473e((C1253e) ((InterfaceC16964e) this.f19786e).get(), (C7596e) ((InterfaceC16964e) this.f19785e).get(), (InterfaceC11882e) ((InterfaceC16964e) this.f19788e).get(), (C16723e) ((InterfaceC16964e) this.f19784e).get(), (InterfaceC8018e) ((InterfaceC16964e) this.f19791e).get(), (C5233e) ((InterfaceC18006e) this.f19790e).get(), (InterfaceC8850e) ((InterfaceC16964e) this.f19787e).get());
    }

    public void license(ContentResolver contentResolver) {
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f19786e;
        if (((HashMap) this.f19785e) == null) {
            atomicBoolean.set(false);
            this.f19785e = new HashMap(16, 1.0f);
            this.f19787e = new Object();
            contentResolver.registerContentObserver(AbstractC1139e.ad, true, new C14373e(this));
            return;
        }
        if (atomicBoolean.getAndSet(false)) {
            ((HashMap) this.f19785e).clear();
            ((HashMap) this.f19788e).clear();
            ((HashMap) this.f19784e).clear();
            ((HashMap) this.f19791e).clear();
            ((HashMap) this.f19790e).clear();
            this.f19787e = new Object();
        }
    }

    public void metrica(String str) {
        C5609e c5609e = (C5609e) this.f19791e;
        synchronized (c5609e) {
            try {
                if (((C0620e) ((AtomicMarkableReference) c5609e.f11962e).getReference()).metrica(str)) {
                    AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c5609e.f11962e;
                    atomicMarkableReference.set((C0620e) atomicMarkableReference.getReference(), true);
                    RunnableC1352e runnableC1352e = new RunnableC1352e(13, c5609e);
                    AtomicReference atomicReference = (AtomicReference) c5609e.f11964e;
                    while (!atomicReference.compareAndSet(null, runnableC1352e)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                    ((ExecutorC4614e) ((C12894e) ((C10017e) c5609e.f11961e).f19785e).f25750e).ad(runnableC1352e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f19789e) {
            case 2:
                return "HttpRequestData(url=" + ((C6399e) this.f19786e) + ", method=" + ((C3434e) this.f19785e) + ')';
            default:
                return super.toString();
        }
    }

    public Object vip() {
        Map map = (Map) ((C5874e) this.f19790e).purchase(AbstractC6216e.ad);
        if (map != null) {
            return map.get(C5811e.ad);
        }
        return null;
    }
}
