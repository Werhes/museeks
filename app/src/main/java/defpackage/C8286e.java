package defpackage;

import android.view.KeyEvent;
import android.view.ViewTreeObserver;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۢٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C8286e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f16957e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f16958e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object f16959e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16960e;

    public /* synthetic */ C8286e(int i, Object obj, Object obj2, Object obj3) {
        this.f16960e = i;
        this.f16958e = obj;
        this.f16957e = obj2;
        this.f16959e = obj3;
    }

    public static /* synthetic */ void ad(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        AssertionError purchase;
        switch (this.f16960e) {
            case 0:
                KeyEvent keyEvent = ((C15301e) obj).ad;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f16957e;
                C6540e c6540e = (C6540e) this.f16958e;
                if (!c6540e.vip()) {
                    interfaceC3314e.setValue(Boolean.FALSE);
                } else if (AbstractC9835e.adcel(keyEvent) == 2 && AbstractC13232e.ad(AbstractC16852e.ad(keyEvent.getKeyCode()), AbstractC13232e.signatures)) {
                    ((InterfaceC3314e) this.f16959e).setValue(Boolean.FALSE);
                    c6540e.ad();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                Object obj2 = AbstractC5851e.startapp;
                C6272e c6272e = (C6272e) this.f16958e;
                C16628e c16628e = c6272e.vip;
                InterfaceC17935e interfaceC17935e = c6272e.ad;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f16957e;
                Object obj3 = concurrentHashMap.get(obj);
                AssertionError assertionError = null;
                EnumC8150e enumC8150e = EnumC8150e.f16545e;
                if (obj3 != null && obj3 != enumC8150e) {
                    AbstractC5851e.smaato(obj3);
                    if (obj3 == obj2) {
                        return null;
                    }
                    return obj3;
                }
                interfaceC17935e.lock();
                try {
                    Object obj4 = concurrentHashMap.get(obj);
                    EnumC8150e enumC8150e2 = EnumC8150e.f16544e;
                    if (obj4 == enumC8150e) {
                        C16722e license = c6272e.license(obj, BuildConfig.FLAVOR);
                        if (license == null) {
                            ad(3);
                            throw null;
                        }
                        if (!license.f32781e) {
                            obj4 = license.f32780e;
                            return obj4;
                        }
                        obj4 = enumC8150e2;
                    }
                    if (obj4 == enumC8150e2) {
                        C16722e license2 = c6272e.license(obj, BuildConfig.FLAVOR);
                        if (license2 == null) {
                            ad(3);
                            throw null;
                        }
                        if (!license2.f32781e) {
                            obj4 = license2.f32780e;
                            return obj4;
                        }
                    }
                    if (obj4 != null) {
                        AbstractC5851e.smaato(obj4);
                        if (obj4 == obj2) {
                            obj4 = null;
                        }
                    } else {
                        try {
                            concurrentHashMap.put(obj, enumC8150e);
                            obj4 = ((Function1) this.f16959e).invoke(obj);
                            if (obj4 != null) {
                                obj2 = obj4;
                            }
                            Object put = concurrentHashMap.put(obj, obj2);
                            if (put != enumC8150e) {
                                assertionError = license(obj, put);
                                throw assertionError;
                            }
                        } catch (Throwable th) {
                            if (AbstractC4584e.license(th)) {
                                try {
                                    Object remove = concurrentHashMap.remove(obj);
                                    if (remove != enumC8150e) {
                                        throw vip(obj, remove);
                                    }
                                    throw th;
                                } finally {
                                }
                            }
                            if (th == assertionError) {
                                try {
                                    concurrentHashMap.remove(obj);
                                    c16628e.getClass();
                                    throw th;
                                } finally {
                                }
                            }
                            Object put2 = concurrentHashMap.put(obj, new C12746e(th));
                            if (put2 != enumC8150e) {
                                throw license(obj, put2);
                            }
                            c16628e.getClass();
                            throw th;
                        }
                    }
                    return obj4;
                } finally {
                    interfaceC17935e.unlock();
                }
            default:
                C1964e c1964e = (C1964e) this.f16958e;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f16957e;
                ViewTreeObserverOnPreDrawListenerC13670e viewTreeObserverOnPreDrawListenerC13670e = (ViewTreeObserverOnPreDrawListenerC13670e) this.f16959e;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC13670e);
                } else {
                    c1964e.f5163e.getViewTreeObserver().removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC13670e);
                }
                return Unit.INSTANCE;
        }
    }

    public AssertionError license(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((C6272e) this.f16958e));
        C6272e.appmetrica(assertionError);
        return assertionError;
    }

    public AssertionError purchase(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((C6272e) this.f16958e), th);
        C6272e.appmetrica(assertionError);
        return assertionError;
    }

    public AssertionError vip(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + EnumC8150e.f16545e + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((C6272e) this.f16958e));
        C6272e.appmetrica(assertionError);
        return assertionError;
    }
}
