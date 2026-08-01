package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC7597e extends AbstractBinderC7835e implements InterfaceC11335e, InterfaceC11914e {
    public static final C17150e mopub = AbstractC9475e.ad;
    public C8331e adcel;
    public final Handler appmetrica;
    public final Set billing;
    public final Context license;
    public final C17150e purchase;
    public C12514e startapp;
    public final C2532e yandex;

    public BinderC7597e(Context context, HandlerC9134e handlerC9134e, C2532e c2532e) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 1);
        this.license = context;
        this.appmetrica = handlerC9134e;
        this.yandex = c2532e;
        this.billing = (Set) c2532e.f6388e;
        this.purchase = mopub;
    }

    @Override // defpackage.InterfaceC11914e
    public final void adcel(C14758e c14758e) {
        this.adcel.metrica(c14758e);
    }

    @Override // defpackage.InterfaceC11335e
    /* renamed from: eًٓؓ */
    public final void mo659e() {
        GoogleSignInAccount googleSignInAccount;
        C12514e c12514e = this.startapp;
        c12514e.getClass();
        try {
            c12514e.crashlytics.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = c12514e.metrica;
                ReentrantLock reentrantLock = C7843e.metrica;
                AbstractC9528e.startapp(context);
                ReentrantLock reentrantLock2 = C7843e.metrica;
                reentrantLock2.lock();
                try {
                    if (C7843e.license == null) {
                        C7843e.license = new C7843e(context.getApplicationContext());
                    }
                    C7843e c7843e = C7843e.license;
                    reentrantLock2.unlock();
                    String ad = c7843e.ad("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(ad)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(ad).length() + 20);
                        sb.append("googleSignInAccount:");
                        sb.append(ad);
                        String ad2 = c7843e.ad(sb.toString());
                        if (ad2 != null) {
                            try {
                                googleSignInAccount = GoogleSignInAccount.billing(ad2);
                            } catch (JSONException unused) {
                            }
                            Integer num = c12514e.f25054class;
                            AbstractC9528e.startapp(num);
                            C4670e c4670e = new C4670e(2, account, num.intValue(), googleSignInAccount);
                            C0357e c0357e = (C0357e) c12514e.loadAd();
                            C6419e c6419e = new C6419e(1, c4670e);
                            Parcel adcel = c0357e.adcel();
                            AbstractC9126e.vip(adcel, c6419e);
                            adcel.writeStrongBinder(this);
                            c0357e.remoteconfig(adcel, 12);
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            }
            googleSignInAccount = null;
            Integer num2 = c12514e.f25054class;
            AbstractC9528e.startapp(num2);
            C4670e c4670e2 = new C4670e(2, account, num2.intValue(), googleSignInAccount);
            C0357e c0357e2 = (C0357e) c12514e.loadAd();
            C6419e c6419e2 = new C6419e(1, c4670e2);
            Parcel adcel2 = c0357e2.adcel();
            AbstractC9126e.vip(adcel2, c6419e2);
            adcel2.writeStrongBinder(this);
            c0357e2.remoteconfig(adcel2, 12);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.appmetrica.post(new RunnableC17144e(this, new C8302e(1, new C14758e(8, null, null), null), false, 26));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.InterfaceC11335e
    public final void remoteconfig(int i) {
        C8331e c8331e = this.adcel;
        C1623e c1623e = (C1623e) ((C16680e) c8331e.f17058e).f32737e.get((C7735e) c8331e.f17055e);
        if (c1623e != null) {
            if (c1623e.mopub) {
                c1623e.smaato(new C14758e(17, null, null));
            } else {
                c1623e.remoteconfig(i);
            }
        }
    }
}
