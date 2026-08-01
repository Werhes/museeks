package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4199e extends AbstractC11130e implements InterfaceC0182e, InterfaceC10798e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17424e f9245e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C0912e f9246e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C2673e f9247e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C5981e f9248e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C7744e f9249e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0149e f9250e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C7744e f9251e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17424e f9252e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C14214e f9253e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C5981e f9254e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C14826e f9255e;

    /* JADX WARN: Type inference failed for: r8v0, types: [eٍؚؔ, java.lang.Object] */
    public C4199e(C14918e c14918e) {
        super(c14918e);
        C4199e c4199e;
        C14918e c14918e2;
        InterfaceC15288e ad = c14918e.billing.ad();
        C17424e c17424e = new C17424e(ad);
        this.f9252e = c17424e;
        C17424e c17424e2 = new C17424e(c14918e.yandex.ad());
        this.f9245e = c17424e2;
        C14826e ad2 = AbstractC9743e.ad(AbstractC5797e.vip(AbstractC5097e.ad(), ad.smaato()));
        this.f9255e = ad2;
        this.f9254e = AbstractC6959e.metrica(0, 2, 2);
        this.f9250e = new C0149e(this, c17424e);
        this.f9253e = new C14214e(this, c17424e2);
        C5981e metrica = AbstractC6959e.metrica(0, 2, 2);
        this.f9248e = metrica;
        InterfaceC5083e interfaceC5083e = null;
        this.f9251e = AbstractC14430e.appmetrica(null);
        this.f9247e = AbstractC14430e.metrica(false);
        this.f9246e = new C0912e(this, (C14911e) this.f22046e);
        this.f9249e = AbstractC14430e.appmetrica(null);
        ?? obj = new Object();
        try {
            c4199e = this;
            c14918e2 = c14918e;
            try {
                AbstractC5418e.startapp(new C1247e(c14918e2, c4199e, (Object) obj, interfaceC5083e, 25));
                AbstractC5336e.purchase(ad2, null, 0, new C7236e(this, interfaceC5083e, 12), 3);
                if (metrica.purchase(EnumC7772e.f15756e)) {
                    return;
                }
                ((C14911e) c4199e.f22046e).license("Cannot signal internal open", new Object[0]);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                close();
                if (!obj.f18534e) {
                    throw th2;
                }
                try {
                    String str = c14918e2.metrica;
                    String str2 = AbstractC6766e.ad;
                    File file = new File(str);
                    if (!(file.exists() && file.isFile())) {
                        throw th2;
                    }
                    boolean[] zArr = {false};
                    int i = AbstractC6026e.ad;
                    realmcJNI.realm_delete_files(str, zArr);
                    if (zArr[0]) {
                        throw th2;
                    }
                    throw new IllegalStateException("It's not allowed to delete the file associated with an open Realm. Remember to call 'close()' on the instances of the realm before deleting its file: ".concat(str));
                } catch (IllegalStateException e) {
                    C14911e c14911e = (C14911e) c4199e.f22046e;
                    String str3 = "An error happened while trying to reset the realm after opening it for the first time failed. The realm must be manually deleted if `initialData` and `initialSubscriptions` should run again: " + e;
                    Object[] copyOf = Arrays.copyOf(new Object[0], 0);
                    if (2 < AbstractC8703e.m2467class(C8880e.license)) {
                        throw th2;
                    }
                    C18409e c18409e = C18409e.metrica;
                    String adcel = AbstractC10257e.adcel(c14911e.f29550e, str3);
                    Object[] copyOf2 = Arrays.copyOf(copyOf, copyOf.length);
                    Iterator it = C8880e.vip.iterator();
                    while (it.hasNext()) {
                        ((C0715e) it.next()).ad(c18409e, 3, adcel, Arrays.copyOf(copyOf2, copyOf2.length));
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            c4199e = this;
            c14918e2 = c14918e;
        }
    }

    public final void close() {
        C14214e c14214e = this.f9253e;
        long j = c14214e.loadAd;
        String str = AbstractC6766e.ad;
        if (j == Thread.currentThread().getId() && c14214e.pro.license()) {
            throw new IllegalStateException("Cannot close the Realm while inside a transaction block");
        }
        C2673e c2673e = this.f9247e;
        c2673e.getClass();
        if (C2673e.vip.getAndSet(c2673e, 1) == 1) {
            return;
        }
        AbstractC5418e.startapp(new C18474e(this, null, 8));
        if (!this.f9248e.purchase(EnumC7772e.f15755e)) {
            ((C14911e) this.f22046e).license("Cannot signal internal close", new Object[0]);
        }
        this.f9252e.close();
        this.f9245e.close();
    }

    @Override // defpackage.AbstractC11130e
    /* renamed from: eًؖٝ, reason: contains not printable characters */
    public final InterfaceC1108e mo1504e(InterfaceC8632e interfaceC8632e, C6571e c6571e) {
        LongPointerWrapper longPointerWrapper;
        InterfaceC5083e interfaceC5083e = null;
        if (c6571e != null) {
            NativePointer nativePointer = yandex().f24580e;
            long j = ((C10484e) c6571e.f13544e).ad;
            List list = (List) c6571e.f13543e;
            long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
            long size = list.size();
            String[] strArr = (String[]) list.toArray(new String[0]);
            int i = AbstractC6026e.ad;
            longPointerWrapper = new LongPointerWrapper(realmcJNI.realm_create_key_path_array(ptr$cinterop_release, j, size, strArr), false, 2, null);
        } else {
            longPointerWrapper = null;
        }
        C0149e c0149e = this.f9250e;
        c0149e.getClass();
        return AbstractC7535e.metrica(new C14164e(c0149e, interfaceC8632e, longPointerWrapper, interfaceC5083e, 17));
    }

    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public final Object m1505e(Function1 function1, AbstractC10731e abstractC10731e) {
        C14214e c14214e = this.f9253e;
        return AbstractC5336e.advert(c14214e.Signature, new C6365e(c14214e, function1, null), abstractC10731e);
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public final C14097e m1506e(InterfaceC7227e interfaceC7227e, String str, Object... objArr) {
        return AbstractC0869e.adcel(this, interfaceC7227e, str, Arrays.copyOf(objArr, objArr.length));
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC0182e
    /* renamed from: eِٜ٘, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C12247e yandex() {
        C12247e c12247e = (C12247e) this.f9251e.ad;
        C6571e c6571e = new C6571e(new C13465e(17, c12247e), c12247e != null ? c12247e.ad() : null);
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: eُٜؒ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4199e f21159e;

            {
                this.f21159e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        C14214e c14214e = this.f21159e.f9253e;
                        if (((C5363e) c14214e.mopub()).ad()) {
                            return c14214e.startapp().m3788e();
                        }
                        return null;
                    default:
                        C0149e c0149e = this.f21159e.f9250e;
                        if (((C5363e) c0149e.adcel()).ad()) {
                            return c0149e.startapp().m3788e();
                        }
                        return null;
                }
            }
        };
        C14214e c14214e = this.f9253e;
        C6571e c6571e2 = new C6571e(function0, ((C5363e) c14214e.mopub()).ad() ? ((C12247e) c14214e.startapp().f28279e.ad).ad() : null);
        final int i2 = 1;
        Function0 function02 = new Function0(this) { // from class: eُٜؒ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4199e f21159e;

            {
                this.f21159e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        C14214e c14214e2 = this.f21159e.f9253e;
                        if (((C5363e) c14214e2.mopub()).ad()) {
                            return c14214e2.startapp().m3788e();
                        }
                        return null;
                    default:
                        C0149e c0149e = this.f21159e.f9250e;
                        if (((C5363e) c0149e.adcel()).ad()) {
                            return c0149e.startapp().m3788e();
                        }
                        return null;
                }
            }
        };
        C0149e c0149e = this.f9250e;
        C12247e c12247e2 = (C12247e) ((Function0) ((C6571e) AbstractC13480e.m3591interface(AbstractC13480e.m3577else(AbstractC6874e.startapp(c6571e, c6571e2, new C6571e(function02, ((C5363e) c0149e.adcel()).ad() ? ((C12247e) c0149e.startapp().f28279e.ad).ad() : null)), new C11797e(13)))).f13544e).invoke();
        if (c12247e2 != null) {
            return c12247e2;
        }
        throw new RuntimeException("Accessing realmReference before realm has been opened");
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC4654e
    public final boolean isClosed() {
        return this.f9247e.vip();
    }
}
