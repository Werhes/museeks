package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4904e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f10395e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f10396e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10397e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10398e;

    public /* synthetic */ RunnableC4904e(int i, Object obj, Object obj2, Object obj3) {
        this.f10398e = i;
        this.f10396e = obj;
        this.f10395e = obj2;
        this.f10397e = obj3;
    }

    public /* synthetic */ RunnableC4904e(AbstractC1037e abstractC1037e, C8928e c8928e, InterfaceC9610e interfaceC9610e, Object obj, int i) {
        this.f10398e = i;
        this.f10396e = abstractC1037e;
        this.f10395e = interfaceC9610e;
        this.f10397e = obj;
    }

    public /* synthetic */ RunnableC4904e(C6681e c6681e, C14677e c14677e, C7169e c7169e) {
        this.f10398e = 11;
        Map map = Collections.EMPTY_MAP;
        this.f10396e = c6681e;
        this.f10395e = c14677e;
        this.f10397e = c7169e;
    }

    public /* synthetic */ RunnableC4904e(C11165e c11165e, C12318e c12318e, String str, Bundle bundle) {
        this.f10398e = 27;
        this.f10396e = c12318e;
        this.f10395e = str;
        this.f10397e = bundle;
    }

    public /* synthetic */ RunnableC4904e(C12799e c12799e, C14677e c14677e, C7169e c7169e) {
        this.f10398e = 14;
        Map map = Collections.EMPTY_MAP;
        this.f10396e = c12799e;
        this.f10395e = c14677e;
        this.f10397e = c7169e;
    }

    public /* synthetic */ RunnableC4904e(ServiceC13230e serviceC13230e, C18424e c18424e, AbstractC5735e abstractC5735e, String str) {
        this.f10398e = 24;
        this.f10396e = serviceC13230e;
        this.f10395e = c18424e;
        this.f10397e = abstractC5735e;
    }

    public /* synthetic */ RunnableC4904e(InterfaceC14812e interfaceC14812e, int i, String str, Throwable th) {
        this.f10398e = 18;
        this.f10395e = interfaceC14812e;
        this.f10397e = str;
        this.f10396e = th;
    }

    private final void ad() {
        C15816e c15816e = (C15816e) this.f10396e;
        AbstractC12947e abstractC12947e = (AbstractC12947e) this.f10395e;
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f10397e;
        try {
            C15097e vip = AbstractC7754e.vip((Context) c15816e.f31190e);
            if (vip == null) {
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            }
            C14484e c14484e = (C14484e) ((InterfaceC12379e) vip.vip);
            synchronized (c14484e.f28633e) {
                c14484e.f28636e = threadPoolExecutor;
            }
            ((InterfaceC12379e) vip.vip).purchase(new C16673e(abstractC12947e, threadPoolExecutor));
        } catch (Throwable th) {
            abstractC12947e.pro(th);
            threadPoolExecutor.shutdown();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:200:0x0458, code lost:
    
        if (r9 != 3) goto L193;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04e1  */
    /* JADX WARN: Type inference failed for: r2v48, types: [eٕۤٙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [eٕۤٙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, eؕٛؓ] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC4904e.run():void");
    }
}
