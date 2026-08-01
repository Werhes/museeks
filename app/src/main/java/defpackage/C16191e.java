package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٓۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16191e implements InterfaceC6781e {
    public final AbstractC7185e ad;
    public final C5363e appmetrica;
    public final String license;
    public final Context metrica;
    public final Set purchase;
    public final AbstractC7185e vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C16191e(Function0 function0, Set set, Function2 function2, Function3 function3, Context context, String str) {
        this.ad = (AbstractC7185e) function2;
        this.vip = (AbstractC7185e) function3;
        this.metrica = context;
        this.license = str;
        this.appmetrica = new C5363e(function0);
        this.purchase = set == AbstractC14041e.ad ? null : AbstractC13480e.m3581e(set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16191e(kotlin.jvm.functions.Function0 r9, java.util.Set r10, kotlin.jvm.functions.Function3 r11, int r12) {
        /*
            r8 = this;
            r0 = 2
            r12 = r12 & r0
            if (r12 == 0) goto L6
            java.util.LinkedHashSet r10 = defpackage.AbstractC14041e.ad
        L6:
            r3 = r10
            eَٔۘ r4 = new eَٔۘ
            r10 = 0
            r12 = 8
            r4.<init>(r0, r12, r10)
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16191e.<init>(kotlin.jvm.functions.Function0, java.util.Set, kotlin.jvm.functions.Function3, int):void");
    }

    @Override // defpackage.InterfaceC6781e
    public final Unit ad() {
        Context context;
        String str;
        C5363e c5363e = this.appmetrica;
        SharedPreferences.Editor edit = ((SharedPreferences) c5363e.getValue()).edit();
        Set set = this.purchase;
        if (set == null) {
            edit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (((SharedPreferences) c5363e.getValue()).getAll().isEmpty() && (context = this.metrica) != null && (str = this.license) != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC12026e.adcel(context, str);
            } else {
                File file = new File(new File(context.getApplicationInfo().dataDir, "shared_prefs"), str.concat(".xml"));
                File file2 = new File(file.getPath() + ".bak");
                file.delete();
                file2.delete();
            }
        }
        if (set != null) {
            set.clear();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (((android.content.SharedPreferences) r5.getValue()).getAll().isEmpty() == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v3, types: [eؚٖؓ, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6781e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.InterfaceC5083e r5, java.lang.Object r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C5448e
            if (r0 == 0) goto L13
            r0 = r5
            eؘؗۙ r0 = (defpackage.C5448e) r0
            int r1 = r0.f11724e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11724e = r1
            goto L1a
        L13:
            eؘؗۙ r0 = new eؘؗۙ
            eُؑ۠ r5 = (defpackage.AbstractC10731e) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.f11723e
            int r1 = r0.f11724e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.AbstractC2003e.purchase(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f11724e = r2
            eؚٖؓ r5 = r4.ad
            java.lang.Object r5 = r5.invoke(r6, r0)
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r5 != r6) goto L3f
            return r6
        L3f:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L4a
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L4a:
            eؘؒؐ r5 = r4.appmetrica
            r6 = 0
            java.util.Set r0 = r4.purchase
            if (r0 != 0) goto L64
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.util.Map r5 = r5.getAll()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L62
            goto L90
        L62:
            r2 = r6
            goto L90
        L64:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L7a
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7a
            goto L62
        L7a:
            java.util.Iterator r0 = r0.iterator()
        L7e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r5.contains(r1)
            if (r1 == 0) goto L7e
        L90:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16191e.metrica(eًؗۖ, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eؚٖؓ, kotlin.jvm.functions.Function3] */
    @Override // defpackage.InterfaceC6781e
    public final Object vip(Object obj, C13696e c13696e) {
        return this.vip.invoke(new C10282e((SharedPreferences) this.appmetrica.getValue(), this.purchase), obj, c13696e);
    }
}
