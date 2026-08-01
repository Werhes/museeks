package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0065e implements View.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Method f1217e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f1218e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Context f1219e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final View f1220e;

    public ViewOnClickListenerC0065e(View view, String str) {
        this.f1220e = view;
        this.f1218e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f1217e == null) {
            View view2 = this.f1220e;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f1218e;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder applovin = AbstractC8703e.applovin("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    applovin.append(view2.getClass());
                    applovin.append(str);
                    throw new IllegalStateException(applovin.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f1217e = method;
                        this.f1219e = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f1217e.invoke(this.f1219e, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
