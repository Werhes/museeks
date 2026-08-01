package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* renamed from: eؚٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7181e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5785e f14675e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14676e;

    public /* synthetic */ C7181e(C5785e c5785e, int i) {
        this.f14676e = i;
        this.f14675e = c5785e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f14676e;
        C5785e c5785e = this.f14675e;
        switch (i) {
            case 0:
                return new C4937e(c5785e);
            default:
                Object firebase = c5785e.firebase();
                try {
                    Object obj = AbstractC5148e.f11028e;
                    Object ad = AbstractC13467e.vip(c5785e) ? AbstractC2251e.ad(c5785e.f11030e, c5785e.isPro()) : null;
                    if (ad == obj) {
                        ad = null;
                    }
                    AbstractC13467e.vip(c5785e);
                    AccessibleObject accessibleObject = ((AccessibleObject) firebase) != null ? (AccessibleObject) firebase : null;
                    if (accessibleObject != null) {
                        accessibleObject.setAccessible(AbstractC15182e.purchase(c5785e));
                    }
                    if (firebase == null) {
                        return null;
                    }
                    if (firebase instanceof Field) {
                        return ((Field) firebase).get(ad);
                    }
                    if (!(firebase instanceof Method)) {
                        throw new AssertionError("delegate field/method " + firebase + " neither field nor method");
                    }
                    int length = ((Method) firebase).getParameterTypes().length;
                    if (length == 0) {
                        return ((Method) firebase).invoke(null, null);
                    }
                    if (length == 1) {
                        Method method = (Method) firebase;
                        if (ad == null) {
                            ad = AbstractC5965e.metrica(((Method) firebase).getParameterTypes()[0]);
                        }
                        return method.invoke(null, ad);
                    }
                    if (length == 2) {
                        return ((Method) firebase).invoke(null, ad, AbstractC5965e.metrica(((Method) firebase).getParameterTypes()[1]));
                    }
                    throw new AssertionError("delegate method " + firebase + " should take 0, 1, or 2 parameters");
                } catch (IllegalAccessException e) {
                    throw new C2123e(8, "Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e);
                }
        }
    }
}
