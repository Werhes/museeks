package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؗۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12288e extends AbstractC6484e {
    public static final Parcelable.Creator<C12288e> CREATOR = new C18517e(26);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final Scope[] f24641e = new Scope[0];

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C1032e[] f24642e = new C1032e[0];

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public IBinder f24643e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public boolean f24644e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final int f24645e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f24646e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C1032e[] f24647e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final String f24648e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f24649e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Account f24650e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final boolean f24651e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public String f24652e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C1032e[] f24653e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f24654e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Bundle f24655e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Scope[] f24656e;

    public C12288e(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C1032e[] c1032eArr, C1032e[] c1032eArr2, boolean z, int i4, boolean z2, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f24641e : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C1032e[] c1032eArr3 = f24642e;
        C1032e[] c1032eArr4 = c1032eArr == null ? c1032eArr3 : c1032eArr;
        c1032eArr3 = c1032eArr2 != null ? c1032eArr2 : c1032eArr3;
        this.f24654e = i;
        this.f24649e = i2;
        this.f24646e = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f24652e = "com.google.android.gms";
        } else {
            this.f24652e = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i5 = AbstractBinderC17538e.license;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface abstractC16277e = queryLocalInterface instanceof InterfaceC6840e ? (InterfaceC6840e) queryLocalInterface : new AbstractC16277e(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                long clearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        C9085e c9085e = (C9085e) abstractC16277e;
                        Parcel m4152e = c9085e.m4152e(c9085e.m4156e(), 2);
                        Account account3 = (Account) AbstractC14342e.ad(m4152e, Account.CREATOR);
                        m4152e.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            }
            this.f24650e = account2;
        } else {
            this.f24643e = iBinder;
            this.f24650e = account;
        }
        this.f24656e = scopeArr2;
        this.f24655e = bundle2;
        this.f24653e = c1032eArr4;
        this.f24647e = c1032eArr3;
        this.f24651e = z;
        this.f24645e = i4;
        this.f24644e = z2;
        this.f24648e = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C18517e.ad(this, parcel, i);
    }
}
