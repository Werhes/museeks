package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12354e {
    public static final List ad = AbstractC6874e.startapp(Application.class, C0333e.class);
    public static final List vip = Collections.singletonList(C0333e.class);

    public static final Constructor ad(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List m670implements = AbstractC1660e.m670implements(constructor.getParameterTypes());
            if (list.equals(m670implements)) {
                return constructor;
            }
            if (list.size() == m670implements.size() && m670implements.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final AbstractC13960e vip(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC13960e) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "Failed to access "), e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(AbstractC17861e.loadAd(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(AbstractC0054e.subs(cls, "An exception happened in constructor of "), e3.getCause());
        }
    }
}
