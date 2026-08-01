package defpackage;

import android.view.View;
import androidx.recyclerview.widget.startapp;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Section;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥٍ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5264e extends AbstractC15876e {

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final C18328e f11339e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final C12344e f11340e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final /* synthetic */ C15293e f11341e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final C15084e f11342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5264e(C15293e c15293e) {
        super(null);
        this.f11341e = c15293e;
        this.f11339e = new C18328e(new C2892e(-70496995, true, new C17689e(0, this)));
        this.f11340e = new C12344e(c15293e);
        this.f11342e = new C15084e(1);
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public final boolean admob() {
        return false;
    }

    @Override // defpackage.AbstractC15876e, defpackage.AbstractC9019e, defpackage.AbstractC13859e
    /* renamed from: class, reason: not valid java name */
    public final void mo1847class(View view) {
        super.mo1847class(view);
        startapp startappVar = this.f8233e;
        if (startappVar == null) {
            startappVar = null;
        }
        ((C17199e) startappVar).f33723e.ad(0, this.f11339e);
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: const */
    public final Cpackage mo447const() {
        return this.f11342e;
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: continue, reason: not valid java name */
    public final void mo1848continue() {
        mo1388instanceof();
    }

    @Override // defpackage.AbstractC15876e
    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final Object mo1849e(Catalog2Section catalog2Section, C3675e c3675e, InterfaceC5083e interfaceC5083e) {
        ArrayList arrayList;
        Object obj;
        File file = AbstractC9001e.ad;
        Iterable iterable = catalog2Section.license;
        if (iterable == null) {
            iterable = C13664e.f27089e;
        }
        Iterator it = iterable.iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Catalog2Block) obj).getVip() instanceof C12971e) {
                break;
            }
        }
        Catalog2Block.LinksBlock linksBlock = obj instanceof Catalog2Block.LinksBlock ? (Catalog2Block.LinksBlock) obj : null;
        if (linksBlock == null) {
            return catalog2Section;
        }
        LinkedHashMap linkedHashMap = c3675e.appmetrica;
        List list = linksBlock.purchase;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                LinkedHashMap linkedHashMap2 = AbstractC9001e.vip;
                CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) linkedHashMap.get((String) obj2);
                String str = customCatalogBlockItem != null ? customCatalogBlockItem.license : null;
                if (str == null) {
                    str = BuildConfig.FLAVOR;
                }
                if (!linkedHashMap2.containsKey(str)) {
                    arrayList2.add(obj2);
                }
            }
            arrayList = arrayList2;
        }
        linksBlock.purchase = arrayList;
        return catalog2Section;
    }

    @Override // defpackage.AbstractC3655e
    /* renamed from: instanceof */
    public final void mo1388instanceof() {
        this.f11341e.m3926private();
        this.f11340e.Signature();
        super.mo1388instanceof();
    }

    @Override // defpackage.AbstractC15876e, defpackage.InterfaceC8370e
    public final C12344e startapp() {
        return this.f11340e;
    }
}
